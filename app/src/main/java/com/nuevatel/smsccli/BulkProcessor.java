package com.nuevatel.smsccli;

import com.nuevatel.common.Processor;
import com.nuevatel.common.thread.SimpleMonitor;
import com.nuevatel.common.util.ExceptionUtil;
import com.nuevatel.common.util.IntegerUtil;
import jaxws.smsc.subscriber.*;

import javax.xml.ws.BindingProvider;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.Exception;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * Created by asalazar on 10/16/15.
 */
public class BulkProcessor implements Processor {

    private SimpleMonitor sync = new SimpleMonitor();

    private String source;

    private String wsUrl;

    private int size;

    private long timeout;

    private long connTimeout;

    private Queue<String[]> queue = new ConcurrentLinkedQueue<>();

    private ExecutorService service;

    private boolean running = false;

    public BulkProcessor(String wsUrl, String source, int size, long timeout, long connTimeout) {
        this.wsUrl = wsUrl;
        this.source = source;
        this.size = size;
        // +1 to include reader thread
        service = Executors.newFixedThreadPool(size + 1);
        this.timeout = timeout;
        this.connTimeout = connTimeout;
    }

    public synchronized boolean isRunning() {
        return running;
    }

    @Override
    public void execute() {
        running = true;
        // launch thread to process lines
        for (int i =0; i < size; i++) {
            SubscriberWSIPort subscriberSrv = newSubscriberWSIPort();
            service.execute(()->processCommand(subscriberSrv));
        }
        // launch thread to load lines
        service.execute(()->readFile());
    }

    private SubscriberWSIPort newSubscriberWSIPort() {
        SubscriberWSI service = new SubscriberWSI();
        SubscriberWSIPort subscriberPort = service.getSubscriberWSIPort();
        ((BindingProvider)subscriberPort).getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, wsUrl);
        ((BindingProvider)subscriberPort).getRequestContext().put("com.sun.xml.internal.ws.request.timeout", timeout);
        ((BindingProvider)subscriberPort).getRequestContext().put("com.sun.xml.internal.ws.connect.timeout", connTimeout);
        return subscriberPort;
    }

    @Override
    public void shutdown(int i) {
        service.shutdown();
        try {
            service.awaitTermination(i, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.exit(0);
    }

    private void processCommand(SubscriberWSIPort subscriberSrv) {
        try {
            while (isRunning() || !queue.isEmpty()) {
                if (queue.isEmpty()) {
                    // wait 1 second
                    sync.doWait(500);
                }

                String[]line = queue.poll();
                if (line == null || line.length == 0) {
                    continue;
                }

                CommandSelector.valueOf(line[0]).doExecute(line, subscriberSrv); // 0 to get cmd id
            }
            shutdown(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private void readFile() {
        try (
                InputStream is = new FileInputStream(source);
                InputStreamReader inReader = new InputStreamReader(is);
                BufferedReader reader = new BufferedReader(inReader)) {
            String rawline;
            while ((rawline = reader.readLine()) != null) {
                String[] line = rawline.split("\\|");
                queue.offer(line);
                sync.doNotifyAll();
            }
            // Schedule to shutdown
            running = false;
            sync.doNotifyAll();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    enum CommandSelector {
        /**
         * addSubscriber|name|layoutId|layoutName|layoutName|bsgwArg0
         */
        addSubscriber {
            @Override
            public void doExecute(String[] args, SubscriberWSIPort subscriberService) {
                if (args.length < 5) {
                    // Wrong cmd
                    printFailed(args, "INVALID_ARGS");
                    return;
                }

                try {
                    SubscriberPort sPort = new SubscriberPort();
                    sPort.setName(args[1]); // Get name
                    sPort.setLayoutId(IntegerUtil.tryParse(args[2])); // Layout id
                    sPort.setLayoutName(args[3]);
                    sPort.setBsgwArg0(IntegerUtil.tryParse(args[4]));
                    subscriberService.addSubscriber(sPort);
                    printOK(args);
                } catch (Exception ex) {
                    String msg = ExceptionUtil.getExceptionMessage(ex);
                    printFailed(args, msg);
                } catch (Throwable ex) {
                    ex.printStackTrace();
                }
            }
        },
        deleteSubscriber {
            @Override
            public void doExecute(String[] args, SubscriberWSIPort subscriberService) {
                if (args.length < 2) {
                    // Wrong cmd
                    printFailed(args, "INVALID_ARGS");
                    return;
                }

                try {
                    subscriberService.deleteSubscriber(args[1]);
                }catch (Exception ex) {
                    String msg = ExceptionUtil.getExceptionMessage(ex);
                    printFailed(args, msg);
                } catch (Throwable ex) {
                    ex.printStackTrace();
                }
            }
        },
        ;

        public void doExecute(String[] args, SubscriberWSIPort subscriberService) {
            // Defgault no op
        }
    }

    private static void printFailed(String[] array, String exceptionMsg) {
        for (String e : array) {
            System.out.print(e + "|");
        }
        System.out.println("FAILED|" + exceptionMsg);
    }

    private static void printOK(String[] array) {
        for (String e : array) {
            System.out.print(e + "|");
        }
        System.out.println("OK");
    }
}

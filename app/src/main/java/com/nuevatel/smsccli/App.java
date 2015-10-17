package com.nuevatel.smsccli;

import com.nuevatel.common.ShutdownHook;
import com.nuevatel.common.util.IntegerUtil;
import com.nuevatel.common.util.LongUtil;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * Main class for smpp, client
 */
public class App {

    public static void main(String[] args) {
        try {
            // Load properties
            Properties prop = loadProperties(args);
            // wait 1 minute to finish all process
            ShutdownHook hook = new ShutdownHook(60, 1);
            // Read props
            String url = prop.getProperty("ws.subscriber.url");
            String source;
            if (args.length >= 2) {
                source = args[1];
            } else {
                source = "/tmp/test.txt";
            }

            Integer size = IntegerUtil.tryParse(prop.getProperty("size"));
            Integer timeout = IntegerUtil.tryParse(prop.getProperty("ws.subscriber.timeout"));
            Integer connTimeout = IntegerUtil.tryParse(prop.getProperty("ws.subscriber.connTimeout"));
            BulkProcessor processor = new BulkProcessor(url, source, size, timeout, connTimeout);
            hook.appendProcess(processor);
            // Start client processor
            processor.execute();
            Runtime.getRuntime().addShutdownHook(hook);
        } catch (Throwable ex) {
            System.out.println("Failed to initialize ...");
            ex.printStackTrace();
        }
    }

    /**
     * Load properties from command line args. If it is nor provided return default properties.
     *
     * @param args Command line args.
     * @return Properties for the app.
     */
    private static Properties loadProperties(String[] args) throws IOException {
        try (InputStream is = args.length >= 2 ?
                new FileInputStream(args[0])
                : App.class.getResourceAsStream("/ws-subscriber.properties")) {
            Properties prop = new Properties();
            prop.load(is);
            return prop;
        }
    }
}

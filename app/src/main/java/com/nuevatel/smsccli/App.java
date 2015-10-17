package com.nuevatel.smsccli;

import com.nuevatel.common.ShutdownHook;

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
            BulkProcessor processor = new BulkProcessor();
            hook.appendProcess(processor);
            // Start client processor
            processor.execute();
            Runtime.getRuntime().addShutdownHook(hook);
        } catch (Throwable ex) {
            System.out.println("Failed to initialize ...");
            System.out.println("EXCEPTION:" + ex.getClass().getName() + " MESSAGE: " + ex.getMessage());
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

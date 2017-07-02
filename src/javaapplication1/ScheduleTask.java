package javaapplication1;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author re
 */


public class ScheduleTask {
    private final ScheduledExecutorService scheduler = 
            Executors.newScheduledThreadPool(1);

    private void readFiles() {
        ReadParseFiles instance = ReadParseFiles.getInstance();
        
    }
    
    public void execTask() {
        final Runnable runnable = new Runnable() {
            public void run() { 
                readFiles();
            }
        };
        final ScheduledFuture<?> runnableHandler =
                scheduler.scheduleAtFixedRate(runnable, 1, 5, TimeUnit.SECONDS);
        scheduler.schedule(new Runnable() {
            public void run() {
                runnableHandler.cancel(true);
            }
        }, 60*5, TimeUnit.SECONDS);
    }
}
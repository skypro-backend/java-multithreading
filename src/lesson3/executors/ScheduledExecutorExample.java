package lesson3.executors;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.stream.Stream;

public class ScheduledExecutorExample {
    public static void main(String[] args) {
        ScheduledExecutorService executorService = Executors.newSingleThreadScheduledExecutor();

        executorService.scheduleAtFixedRate(new Worker(), 0, 3, TimeUnit.SECONDS);

    }

    private static class Worker implements Runnable {

        @Override
        public void run() {
            System.out.println("Hello SkyPro");

//            try {
//                Thread.sleep(5000);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }

            System.out.println("I'm done");
        }
    }
}

package lesson3.executors;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.Stream;

public class FixedThreadPoolExample {
    public static void main(String[] args) {
        int numOfThreads = 3;
        ExecutorService executorService = Executors.newFixedThreadPool(numOfThreads);

        Stream.generate(Worker::new)
                .limit(20)
                .forEach(executorService::execute);

        executorService.shutdown();
    }

    private static class Worker implements Runnable {

        @Override
        public void run() {
            System.out.println("Hello SkyPro");

            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

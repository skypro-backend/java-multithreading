package lesson3.executors;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.Stream;

public class SingleThreadExecutorExample {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newSingleThreadExecutor();

        Stream.generate(Worker::new)
                .limit(20)
                .map(Thread::new)
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

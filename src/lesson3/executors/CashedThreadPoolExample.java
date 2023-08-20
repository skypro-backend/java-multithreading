package lesson3.executors;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.stream.Stream;

public class CashedThreadPoolExample {
    public static void main(String[] args) {
        ThreadPoolExecutor executorService = (ThreadPoolExecutor) Executors.newCachedThreadPool();

        List<? extends Runnable> runnableList = Stream.generate(Worker::new)
                .limit(2000)
                .toList();

        runnableList.forEach(executorService::execute);

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

package lesson3.parallel;

import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.stream.IntStream;

public class ParallelExample {

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        ExecutorService executorService = Executors.newFixedThreadPool(5);

        List<String> list = IntStream.range(0, 20)
                .parallel()
                .mapToObj(ignored -> executorService.submit(ParallelExample::someExternalMethod))
                .map(ParallelExample::getFutureValue)
                .toList();

        System.out.println(list);

        System.out.println();
        System.out.println(System.currentTimeMillis() - start + " ms");
    }


    private static String someExternalMethod() {
        System.out.println("Hello SkyPro");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        return "{\"key\": \"value\"}";
    }

    private static <V> V getFutureValue(Future<V> future) {
        try {
            return future.get();
        } catch (InterruptedException | ExecutionException e) {
            throw new RuntimeException(e);
        }
    }
}

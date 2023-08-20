package lesson3.callable;

import java.util.concurrent.*;

public class WithCallable {

    private static String someExternalMethod() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        return "{\"key\": \"value\"}";
    }

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Future<String> future = executorService.submit(WithCallable::someExternalMethod);

        System.out.println("Какая-то логика");

        String value = future.get();
        executorService.shutdown();

        System.out.println(value);
    }


}

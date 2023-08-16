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
        Worker callable = new Worker();
        Future<String> future = executorService.submit(callable);

        System.out.println("Какая-то логика");

        String value = future.get();

        System.out.println(value);
    }


    private static class Worker implements Callable<String> {
        @Override
        public String call() {
            System.out.println("Thread has started");
            String someString = WithCallable.someExternalMethod();

            return someString;
        }
    }


}

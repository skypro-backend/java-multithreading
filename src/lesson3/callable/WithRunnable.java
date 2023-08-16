package lesson3.callable;

public class WithRunnable {

    private static String someExternalMethod() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        return "{\"key\": \"value\"}";
    }

    public static void main(String[] args) throws InterruptedException {
        Worker thread = new Worker();
        thread.start();

        System.out.println("Какая-то логика");

        thread.join();

        String value = thread.getSomeJson();
        System.out.println(value);
    }


    private static class Worker extends Thread {
        String someJson;
        @Override
        public void run() {
            System.out.println("Thread has started");
            String someString = WithRunnable.someExternalMethod();

            this.someJson = someString;
        }

        public String getSomeJson() {
            return someJson;
        }
    }


}

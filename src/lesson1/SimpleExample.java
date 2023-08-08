package lesson1;

public class SimpleExample {
    public static void main(String[] args) {
        Runnable runnable = () -> {

            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            System.out.println("I'm Thread");
            //throw new NullPointerException();
        };

        Thread thread = new Thread(runnable);
        thread.start();

        try {
            thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

//        try {
//            thread.join();
//        } catch (InterruptedException e) {
//            System.out.println(e.getMessage());
//        }

        System.out.println("I'm Main");
        System.out.println(thread.getState());
    }
}

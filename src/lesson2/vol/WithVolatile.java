package lesson2.vol;

public class WithVolatile extends Thread {
    private volatile boolean isEnough;

    @Override
    public void run() {
        int i = 0;
        while (!isEnough) {
            i++;
        }
        System.out.println("Total count: " + i);
    }

    private void stopNow() {
        isEnough = true;
    }

    public static void main(String[] args) throws InterruptedException {
        WithVolatile withoutVolatile = new WithVolatile();
        withoutVolatile.start();

        Thread.sleep(10);

        withoutVolatile.stopNow();
        System.out.println("Main thread finished");
    }
}


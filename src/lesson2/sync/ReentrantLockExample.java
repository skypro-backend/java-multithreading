package lesson2.sync;

import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockExample {
    private static ReentrantLock reentrantLock = new ReentrantLock();

    public static void main(String[] args) {
        Thread thread1 = new Thread(new Worker());
        Thread thread2 = new Thread(new Worker());

        thread1.start();
        thread2.start();
    }

    static class Worker implements Runnable {

        @Override
        public void run() {
            System.out.println("Поток перед попыткой захвата блокировки");
            reentrantLock.lock();
            try {
                System.out.println("Поток захватил блокировку и начал работу");
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                System.out.println("Поток освободил блокировку");
                reentrantLock.unlock();
            }
        }
    }
}

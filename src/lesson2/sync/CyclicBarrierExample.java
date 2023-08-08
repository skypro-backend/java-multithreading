package lesson2.sync;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.stream.Stream;

public class CyclicBarrierExample {

    private static final int THREAD_COUNT = 5;
    private static CyclicBarrier cyclicBarrier = new CyclicBarrier(THREAD_COUNT);

    public static void main(String[] args) {
        Stream.generate(Worker::new)
                .limit(THREAD_COUNT)
                .map(Thread::new)
                .forEach(Thread::start);
    }

    private static class Worker implements Runnable {

        @Override
        public void run() {
            try {
                System.out.println("Поток перед барьером");
                cyclicBarrier.await();
                System.out.println("Поток после барьера");
            } catch (InterruptedException | BrokenBarrierException e) {
                e.printStackTrace();
            }
        }
    }
}

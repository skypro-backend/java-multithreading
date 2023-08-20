package lesson3.atomic;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Stream;

public class AtomicExample {

    private static AtomicInteger counter = new AtomicInteger(0);

    public static void main(String[] args) {

        List<Thread> threadList = Stream.generate(Worker::new)
                .limit(10)
                .map(Thread::new)
                .toList();

        threadList.forEach(Thread::start);

        threadList.forEach(thread -> {
            try {
                thread.join();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        System.out.println(counter.get());
    }


    private static class Worker implements Runnable {
        @Override
        public void run() {
            for (int i = 0; i < 100_000; i++) {
                counter.incrementAndGet();
            }
        }
    }
}

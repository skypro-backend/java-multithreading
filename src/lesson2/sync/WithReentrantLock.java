package lesson2.sync;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;
import java.util.stream.IntStream;

public class WithReentrantLock {
    private static List<Double> doubleList = new ArrayList<>();
    private static ReentrantLock reentrantLock = new ReentrantLock();

    public static void main(String[] args) {
        IntStream.range(0, 10)
                .mapToObj(ignored -> new Thread(WithReentrantLock::someMethod))
                .forEach(Thread::start);
    }

    public static void someMethod() {
        for (int i = 0; i < 100_000; i++) {
            double d = Math.random() / Math.random();

            reentrantLock.lock();

            doubleList.add(d);

            reentrantLock.unlock();
        }

        System.out.println(doubleList.size());

        reentrantLock.lock();
        doubleList.clear();
        reentrantLock.unlock();
    }
}

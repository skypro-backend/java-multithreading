package lesson2.collections;

import java.util.*;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.stream.IntStream;

public class WithSynchronisedCollectionExample {
    private static List<Double> doubleList = Collections.synchronizedList(new ArrayList<>());
    private static CyclicBarrier cyclicBarrier = new CyclicBarrier(50);

    public static void main(String[] args) {
        long start = System.currentTimeMillis();

        List<Thread> threads = IntStream.range(0, 50)
                .mapToObj(ignored -> new Thread(WithSynchronisedCollectionExample::someMethod))
                .toList();

        threads.forEach(Thread::start);

        threads.forEach(thread -> {
            try {
                thread.join();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        System.out.println();
        System.out.println("Time : " + (System.currentTimeMillis() - start) + " ms");
    }

    public static void someMethod() {
//        try {
//            cyclicBarrier.await();
//        } catch (InterruptedException | BrokenBarrierException e) {
//            e.printStackTrace();
//        }

        for (int i = 0; i < 100_000; i++) {
            doubleList.add(Math.random() / Math.random());
        }

        System.out.println(doubleList.size());
        doubleList.clear();
    }
}


package lesson2.collections;

import java.util.*;
import java.util.stream.Stream;

public class MapExample {

    private static Map<Integer, Integer> map = new HashMap<>();

    public static void main(String[] args) throws InterruptedException {
        long start = System.currentTimeMillis();

        List<Thread> threadList = Stream.generate(Worker::new)
                .limit(20)
                .map(Thread::new)
                .toList();

        threadList.forEach(Thread::start);

        for (Thread thread : threadList) {
            thread.join();
        }

        System.out.println(map.size());
        System.out.println(System.currentTimeMillis() - start + " ms");
    }

    private static class Worker implements Runnable {

        @Override
        public void run() {
            for (int i = 0; i < 100_000; i++) {
                map.put(i, i);
            }
        }
    }
}

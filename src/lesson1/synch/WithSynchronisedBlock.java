package lesson1.synch;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.IntStream;

public class WithSynchronisedBlock {
    private static List<Double> doubleList = new ArrayList<>();


    public static void main(String[] args) {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        concurrentHashMap.put(null, new Object());

        IntStream.of(-5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5)
                .filter(w -> w > 0)
                .forEach(System.out::println);

//        IntStream.range(0, 10)
//                .mapToObj(ignored -> new Thread(WithSynchronisedBlock::someMethod))
//                .forEach(Thread::start);
    }

    public static void someMethod() {
        for (int i = 0; i < 1000_000; i++) {
            double d = Math.random() / Math.random();

            synchronized (doubleList) {
                doubleList.add(d);
            }
        }

        System.out.println(doubleList.size());
        doubleList.clear();
    }
}

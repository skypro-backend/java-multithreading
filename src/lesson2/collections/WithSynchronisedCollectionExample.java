package lesson2.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class WithSynchronisedCollectionExample {
    private static List<Double> doubleList = new ArrayList<>();

    public static void main(String[] args) {
        IntStream.range(0, 50)
                .mapToObj(ignored -> new Thread(WithSynchronisedCollectionExample::someMethod))
                .forEach(Thread::start);
    }

    public  static void someMethod() {
        for (int i = 0; i < 100_000; i++) {
            doubleList.add(Math.random() / Math.random());
        }

        System.out.println(doubleList.size());
        doubleList.clear();
    }
}


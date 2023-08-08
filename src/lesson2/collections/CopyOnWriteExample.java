package lesson2.collections;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteExample {

    public static void main(String[] args) {
        List<Integer> list = new CopyOnWriteArrayList<>(List.of(3, 8, 9, 15));
        Iterator<Integer> iterator = list.iterator();

        System.out.println("Изначальный размер " + list.size());
        list.add(18);
        System.out.println("Размер после добавления " + list.size());

        int iteratorSize = 0;
        while (iterator.hasNext()){
            iterator.next();
            iteratorSize++;
        }
        System.out.println("Размер итератора " + iteratorSize);
    }
}

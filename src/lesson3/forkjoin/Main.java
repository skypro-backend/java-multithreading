package lesson3.forkjoin;

import java.util.concurrent.ForkJoinPool;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        int[] arr = IntStream.range(0 , 1000)
                .toArray();

        CustomRecursiveTask customRecursiveTask = new CustomRecursiveTask(arr);
        ForkJoinPool forkJoinPool = new ForkJoinPool();

        int sum = forkJoinPool.invoke(customRecursiveTask);
        System.out.println(sum);
    }




}

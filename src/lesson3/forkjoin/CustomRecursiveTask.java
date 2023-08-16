package lesson3.forkjoin;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.ForkJoinTask;
import java.util.concurrent.RecursiveTask;

public class CustomRecursiveTask extends RecursiveTask<Integer> {
    private int[] arr;

    private static final int THRESHOLD = 20;

    public CustomRecursiveTask(int[] arr) {
        this.arr = arr;
    }

    @Override
    protected Integer compute() {
        if (arr.length <= THRESHOLD) {
            return processing(arr);
        }

        Collection<CustomRecursiveTask> tasks = ForkJoinTask.invokeAll(createSubtasks());
        return tasks.stream()
                .mapToInt(ForkJoinTask::join)
                .sum();

    }

    private Collection<CustomRecursiveTask> createSubtasks() {

        CustomRecursiveTask task1 = new CustomRecursiveTask(
                Arrays.copyOfRange(arr, 0, arr.length / 2));
        CustomRecursiveTask task2 = new CustomRecursiveTask(
                Arrays.copyOfRange(arr, arr.length / 2, arr.length));

        return List.of(task1, task2);
    }

    private static Integer processing(int[] arr) {
        return Arrays.stream(arr)
                .filter(a -> a > 10 && a < 27)
                .map(a -> a * 10)
                .sum();
    }
}
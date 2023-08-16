package lesson3.parallel;

import java.util.List;
import java.util.stream.IntStream;

public class ParallelExample {

    public static void main(String[] args) {
        long start = System.currentTimeMillis();

       List<String> list = IntStream.range(0, 20)
                //.parallel()
                .mapToObj(ignored -> ParallelExample.someExternalMethod())
                .toList();

        System.out.println(list);

        System.out.println();
        System.out.println(System.currentTimeMillis() - start + " ms");
    }



    private static String someExternalMethod() {
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        return "{\"key\": \"value\"}";
    }
}

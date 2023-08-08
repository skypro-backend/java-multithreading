package lesson1.wait;

import java.util.stream.IntStream;

public class ParkingExample {
    private static Parking parking = new WithWaitAndNotify();

    public static void main(String[] args) {
        Thread producer = new Thread(() ->
                IntStream.range(0, 1000)
                        .forEach(ignored -> parking.in()));

        Thread consumer = new Thread(() ->
                IntStream.range(0, 1000)
                        .forEach(ignored -> parking.out()));

        producer.start();
        consumer.start();
    }

}

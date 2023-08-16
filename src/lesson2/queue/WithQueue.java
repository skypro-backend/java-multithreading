package lesson2.queue;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.SynchronousQueue;

public class WithQueue implements Parking {
    private static final int PARKING_PLACE_MAX_COUNT = 500;
    private int carCount;
    private SynchronousQueue<Car> blockingQueue;

    public WithQueue() {
        this.blockingQueue = new SynchronousQueue<>();
    }

    public void in() {
        try {
            blockingQueue.put(new Car());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.printf("Количество машин :%d\nКоличество свободных мест %d\n",
                blockingQueue.size(),
                PARKING_PLACE_MAX_COUNT - blockingQueue.size());
    }

    public void out() {
        try {
            blockingQueue.take();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.printf("Количество машин :%d\nКоличество свободных мест %d\n",
                blockingQueue.size(),
                PARKING_PLACE_MAX_COUNT - blockingQueue.size());
    }
}

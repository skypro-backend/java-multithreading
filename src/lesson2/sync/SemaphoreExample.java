package lesson2.sync;

import java.util.concurrent.Semaphore;
import java.util.stream.IntStream;

public class SemaphoreExample {

    public static void main(String[] args) {
        // Создаем семафор с ограничениями на 2 потока
        Semaphore semaphore = new Semaphore(2);

        // Создаем и запускаем несколько потоков
        IntStream.range(0, 5)
                .mapToObj(i -> new Worker(semaphore, i))
                .map(Thread::new)
                .forEach(Thread::start);
    }

    static class Worker implements Runnable {
        private final Semaphore semaphore;
        private final int workerId;

        public Worker(Semaphore semaphore, int workerId) {
            this.semaphore = semaphore;
            this.workerId = workerId;
        }

        @Override
        public void run() {
            try {
                System.out.println("Поток " + workerId + " перед запросом разрешения");
                semaphore.acquire();
                System.out.println("Поток " + workerId + " получил разрешение и начал работу");
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                System.out.println("Поток " + workerId + " освободил разрешение");
                semaphore.release();
            }
        }
    }
}

package Multiple_thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) throws InterruptedException {
//        TestThread thread1 = new TestThread();
//        TestThread thread2 = new TestThread();
//        thread1.start();
//        thread2.start();
//
//        TestRunnable testRunnable = new TestRunnable();
//        Thread thread1 = new Thread(testRunnable);
//        Thread thread2 = new Thread(testRunnable);
//        thread1.start();
//        thread2.start();

//        Counter counter = new Counter();
//        Thread thread5 = new Thread(() -> {
//            for (int i = 0; i < 100000; i++) {
//                counter.increment();
//                System.out.println("thread5: " + counter.getCount());
//            }
//        });
//
//        Thread thread6 = new Thread(() -> {
//            for (int i = 0; i < 100000; i++) {
//                counter.increment();
//                System.out.println("thread6: " + counter.getCount());
//            }
//        });
//
//        thread5.start();
//        thread6.start();
//
//        try {
//            thread5.join();
//            thread6.join();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//
//        System.out.println("Final count: " + counter.getCount());

        ExecutorService executorService = Executors.newFixedThreadPool(3);

        for (int i = 0; i < 5; i++) {
            executorService.submit(() -> {
                System.out.println("Thread name: " + Thread.currentThread().getName() + " Is Running");
            });
        }

        executorService.shutdown();
    }
}

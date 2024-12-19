package Thread;

public class Main {

    public static synchronized void synchronizedMethod() {
        System.out.println("Synchronized method");
        // Code here will be accessed by one thread at a time
    }

    public void synchronizedBlock() {
        synchronized (this) {
            System.out.println("Synchronized block");
            // Code here will be accessed by one thread at a time
        }
    }

    // Extend Thread
    static class MyExtendThread extends Thread {
        @Override
        public void run() {
            System.out.println("MyExtendThread is running");
        }
    }

    static class MyRunnable implements Runnable {
        @Override
        public void run() {
            System.out.println("MyRunnable is running");
        }
    }

    public static void main(String[] args) {
        // Synchronous
        System.out.println("Task 1 Synchronous");
        System.out.println("Task 2 Synchronous");
        System.out.println("Task 3 Synchronous");
        System.out.println("--------------------");

        // Asynchronous
        System.out.println("Task 1 Asynchronous");
        new Thread(() -> {
            System.out.println("Task 2 Asynchronous");
        }).start();
        System.out.println("Task 3 Asynchronous");
//        output:
//        Task 1 Asynchronous
//        Task 3 Asynchronous
//        Task 2 Asynchronous

        // Extend Thread
        MyExtendThread extendThread = new MyExtendThread();
        extendThread.start();
//        output:
//        MyExtendThread is running

        // Implement Runnable
        MyRunnable myRunnable = new MyRunnable();
        Thread thread = new Thread(myRunnable);
        thread.start();
//        output:
//        MyRunnable is running

        // Lambda Runnable
        Runnable lambdaRunnable = () -> {
            System.out.println("Lambda Runnable is running");
        };

        Thread lambdaThread = new Thread(lambdaRunnable);
        lambdaThread.start();
//        output:
//        Lambda Runnable is running

        // Multi-threading
        Thread thread1 = new Thread(() -> {
            synchronizedMethod();
            for (int i = 0; i < 5; i++){
                System.out.println("Thread 1: " + i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    System.out.println("Thread has been interrupted");
                }
            }
        });

        Thread thread2 = new Thread(() ->{
           synchronizedMethod();
              for (int i = 0; i < 5; i++){
                System.out.println("Thread 2: " + i);
                try {
                     Thread.sleep(1000);
                } catch (InterruptedException e) {
                     System.out.println("Thread has been interrupted");
                }
              }
        });

        thread1.start();
        thread2.start();

//        output:
//        Synchronized method
//        Synchronized method
//        Thread 1: 0
//        Thread 2: 0
//        Thread 1: 1
//        Thread 2: 1
//        Thread 1: 2
//        Thread 2: 2
//        Thread 1: 3
//        Thread 2: 3
//        Thread 1: 4
//        Thread 2: 4
//        giải thích:
//        - synchronizedMethod() sẽ được thực thi bởi một thread tại một thời điểm
//        - Thread 1 và Thread 2 sẽ chạy song song, nhưng khi gặp synchronizedMethod() thì chỉ có một thread được thực thi


        // Check if threads are alive
        System.out.println("Is Thread 1 alive? " + thread1.isAlive());
        System.out.println("Is Thread 2 alive? " + thread2.isAlive());
//        output:
//        Is Thread 1 alive? true
//        Is Thread 2 alive? true
//        -> Thread 1 và Thread 2 đang chạy
//        -> Khi thread kết thúc, isAlive() sẽ trả về false

        // Wait for threads to finish
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            System.out.println("Threads have been interrupted");
        }
        System.out.println("Is Thread 1 alive? " + thread1.isAlive());
        System.out.println("Is Thread 2 alive? " + thread2.isAlive());
//        output:
//        Thread 1: 0
//        Thread 2: 0
//        Thread 1: 1
//        Thread 2: 1
//        Thread 1: 2
//        Thread 2: 2
//        Thread 1: 3
//        Thread 2: 3
//        Thread 1: 4
//        Thread 2: 4
//        Is Thread 1 alive? false
//        Is Thread 2 alive? false
    }
}

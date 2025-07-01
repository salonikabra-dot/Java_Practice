package Java_Practice.MultiThreading;
// 1. Extending Thread class
class MyThread extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("MyThread running: " + i);
            try {
                Thread.sleep(500);  // Sleep for 500 ms
            } catch (InterruptedException e) {
                System.out.println("MyThread interrupted");
            }
        }
    }
}

// 2. Implementing Runnable interface
class MyRunnable implements Runnable {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("MyRunnable running: " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("MyRunnable interrupted");
            }
        }
    }
}

public class MultithreadingExample {
    public static void main(String[] args) {
        // Using Thread class
        MyThread t1 = new MyThread();
        
        // Using Runnable interface
        Thread t2 = new Thread(new MyRunnable());

        // Start both threads
        t1.start();
        t2.start();

        System.out.println("Main thread finished");
    }
}

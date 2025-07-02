package Java_Practice.MultiThreading;

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
        
        MyThread t1 = new MyThread();
        
        
        Thread t2 = new Thread(new MyRunnable());

        
        t1.start();
        t2.start();

        System.out.println("Main thread finished");
    }
}

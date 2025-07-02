package Java_Practice.JMM;

public class JmmExample {

    private static volatile boolean running = true;

    public static void main(String[] args) throws InterruptedException {
        Thread worker = new Thread(() -> {
            System.out.println("Worker started");
            while (running) { /* spin-wait until running becomes false */ }
            System.out.println("Worker detected running=false and exits.");
        });

        worker.start();

        Thread.sleep(2000);
        System.out.println("Main thread setting running = false");
        running = false;  // signals the worker thread to exit

        worker.join();
        System.out.println("Main thread exiting.");
    }
}

    


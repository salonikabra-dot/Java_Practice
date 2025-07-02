package Java_Practice.concurrency;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BankAccount {
    private int balance = 0;
    private final Lock lock = new ReentrantLock();

    public void deposit(int amount) {
        lock.lock();
        try {
            balance += amount;
            System.out.printf("%s deposited %d, new balance: %d%n", 
                              Thread.currentThread().getName(), amount, balance);
        } finally {
            lock.unlock();
        }
    }

    public void withdraw(int amount) {
        lock.lock();
        try {
            if (balance >= amount) {
                balance -= amount;
                System.out.printf("%s withdrew %d, new balance: %d%n", 
                                  Thread.currentThread().getName(), amount, balance);
            } else {
                System.out.printf("%s tried to withdraw %d but insufficient funds (balance: %d)%n", 
                                  Thread.currentThread().getName(), amount, balance);
            }
        } finally {
            lock.unlock();
        }
    }

    public static void main(String[] args) {
        BankAccount account = new BankAccount();

        Runnable depositor = () -> { for(int i=0;i<5;i++) account.deposit(100); };
        Runnable withdrawer = () -> { for(int i=0;i<5;i++) account.withdraw(50); };

        Thread t1 = new Thread(depositor, "T1");
        Thread t2 = new Thread(withdrawer, "T2");

        t1.start();
        t2.start();
    }
}

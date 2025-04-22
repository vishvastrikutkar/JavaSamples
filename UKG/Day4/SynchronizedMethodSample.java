package UKG.Day4;

class BankAccount {
    private int Balance;

    BankAccount(int balance) {
        this.Balance = balance;
        System.out.println("Initial Balance: " + Balance);
    }

    public int getBalance() {
        return Balance;
    }

    // Synchronized method to avoid multiple threads accessing this method at the same time
    public synchronized void withDraw(int amount, String name) {
        if (Balance < amount) {
            System.out.println("Insufficient Balance");
        } else {
            try {
                Thread.sleep(400);
            } catch (InterruptedException e) {
                System.out.println("Exception caught: " + e.getMessage());
            }
            Balance -= amount;
            System.out.println("Transaction done by: " + name);
            System.out.println("Amount Withdrawn: " + amount);
            System.out.println("Remaining Balance: " + Balance);
        }
    }
}

public class SynchronizedMethodSample {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount(1000);

        Thread t1 = new Thread(() -> {
            bankAccount.withDraw(500, "Thread 1");
        });

        Thread t2 = new Thread(() -> {
            bankAccount.withDraw(100, "Thread 2");
        });

        Thread t3 = new Thread(() -> {
            bankAccount.withDraw(100, "Thread 3");
        });

        Thread t4 = new Thread(() -> {
            bankAccount.withDraw(100, "Thread 4");
        });

        t1.start();
        t2.start();
        t3.start();
        t4.start();

        System.out.println("Final Balance :" + bankAccount.getBalance());
    }

}

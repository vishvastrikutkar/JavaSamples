package UKG.Day4;

class EvenNumberThread extends Thread {
    @Override
    public void run() {
        try {

            for (int i = 0; i <= 10; i++) {
                if (i % 2 == 0) {
                    System.out.println("Even Number: " + i);
                    Thread.sleep(200);
                }
            }
        }catch (InterruptedException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }

    }
}

class OddNumberThread implements Runnable
{
    @Override
    public void run() {
            for (int i = 0; i <= 10; i++) {
                if (i % 2 != 0) {
                    System.out.println("Odd Number: " + i);
                    try {
                        Thread.sleep(400);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
    }
}

public class ThreadSample {
    public static void main(String[] args) {
        EvenNumberThread evenNumberThread = new EvenNumberThread();
        evenNumberThread.start();

        OddNumberThread oddNumberThread = new OddNumberThread();
        Thread thread = new Thread(oddNumberThread);
        thread.start();
    }
}

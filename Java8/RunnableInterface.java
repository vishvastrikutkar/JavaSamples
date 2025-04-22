package Java8;

public class RunnableInterface {
    public static void main(String[] args) {
        Thread t=new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=0;i<=2;i++)
                {
                    System.out.println("Child Thread");
                    try {
                        Thread.sleep(500); // Sleep for 500 milliseconds to simulate some delay
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt(); // Restore interrupted status
                    }

                }
            }
        });
        t.start();
        for(int i=0;i<=2;i++)
        {
            System.out.println("Main Thread");
            try {
                Thread.sleep(500); // Sleep for 500 milliseconds to simulate some delay
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt(); // Restore interrupted status
            }
        }
    }
}

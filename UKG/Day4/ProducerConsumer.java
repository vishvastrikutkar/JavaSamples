package UKG.Day4;


import java.util.LinkedList;
import java.util.Queue;

class Buffer {
    private Queue<Integer> queue = new LinkedList<>();
    private int capacity;

    public Buffer(int capacity) {
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    public void produce(int i) throws InterruptedException {
        while (queue.size() == getCapacity()) {
            System.out.println("Buffer is full. Waiting to get vacated..");
            wait(); // Wait for consumer thread to consume item from buffer.
        }
        queue.add(i);
        System.out.println("Produced item " + i);
        displayBuffer(queue);
        notifyAll(); // Notify thread
    }

    public synchronized void consume() throws InterruptedException {
        while (queue.isEmpty()) {
            System.out.println("Buffer is empty. Waiting...");
            wait(); // Wait for producer thread to add new item to buffer
        }
        System.out.println("Consumed: " + queue.poll());
        displayBuffer(queue);
        notifyAll(); // Notify Thread.
    }

    public void displayBuffer(Queue<Integer> buffer) {
        System.out.println("Buffer :" + buffer.toString());
    }

}

public class ProducerConsumer {

    public static void main(String[] args) {
        Buffer buffer = new Buffer(10);
        for (int i = 0; i < 3; i++) {
            Thread producerThread = new Thread(() -> {
                int item = 1;
                while (true) {
                    try {
                        buffer.produce(item++);
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            });
            producerThread.start();

        }
        for (int i = 0; i < 5; i++) {

            Thread consumerThread = new Thread(() -> {
                while (true) {
                    try {
                        buffer.consume();
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            });
            consumerThread.start();
        }


//        producerThread.start();
//        consumerThread.start();
//        consumerThread.start();
    }

}

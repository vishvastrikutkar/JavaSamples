package Collections;

import java.util.PriorityQueue;

public class PriorityQueueSample {

    public static void main(String[] args)
    {
        PriorityQueue<String> priorityQueue = new PriorityQueue<>();

        for(int i=1;i<=9;i++)
        {
            priorityQueue.add("Hello "+i+"\t");
        }
        System.out.println("Head of the Queue: " +priorityQueue.element());

        // Remove the head
        priorityQueue.poll();
        System.out.println("Head of the Queue: " +priorityQueue.peek());

        priorityQueue.remove();
        System.out.println("Head of the Queue: " +priorityQueue.peek());

        // Run time exception
        //priorityQueue.add(null);

        for (String s : priorityQueue) System.out.println(s);


    }

}

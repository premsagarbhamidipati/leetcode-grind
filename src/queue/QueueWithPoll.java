package queue;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * poll method returns and removes element from front end of the queue or head of the queue.
 * Source: https://www.geeksforgeeks.org/queue-poll-method-in-java/?ref=ml_lbp
 */

public class QueueWithPoll {

    public static void main(String[] args) {

        Queue<Integer> queue = new LinkedList<>();

        queue.add(7855642);
        queue.add(35658786);
        queue.add(5278367);
        queue.add(74381793);

        System.out.println("Queue : " + queue);

        // poll method returns and removes element from front end of the queue or head of the queue.
        System.out.println("Queue data now has: " + queue.poll());

        System.out.println("Queue : " + queue);
    }
}

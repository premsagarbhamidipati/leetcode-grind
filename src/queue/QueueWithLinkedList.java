package queue;

import java.util.LinkedList;
import java.util.Queue;


/**
 *
 * The offer(E e) method of Queue Interface inserts the specified element into this queue if
 * it is possible to do so immediately without violating capacity restrictions.
 * This method is preferable to add() method since this method does not throws an exception
 * when the capacity of the container is full since it returns false.
 *
 *
 */

/**
 *
 * The same can be implemented using ArrayDeque, LinkedBlockingQueue, ConcurrentLinkedDeque
 * Source: https://www.geeksforgeeks.org/queue-offer-method-in-java/
 */
public class QueueWithLinkedList {

    public static void main(String[] args) {


        // create an object of Queue
        Queue<Integer> queue = new LinkedList<>();

        //Returns: offer method returns true on successful insertion else it returns false.
        if (queue.offer(10)) {
            System.out.println("The queue is not full " + "and 10 is inserted" );
        } else {
            System.out.println("The queue is full");
        }

        if (queue.offer(15)) {
            System.out.println("The queue is not full " + "and 15 is inserted" );
        } else {
            System.out.println("The queue is full");
        }

        if (queue.offer(25)) {
            System.out.println("The queue is not full " + "and 25 is inserted" );
        } else {
            System.out.println("The queue is full");
        }


        if (queue.offer(20)) {
            System.out.println("The queue is not full " + "and 20 is inserted" );
        } else {
            System.out.println("The queue is full");
        }

        System.out.println("Queue: " + queue);

    }
}

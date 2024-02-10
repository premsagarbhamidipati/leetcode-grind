package leetcode.easy.linkedlist;


import static leetcode.easy.linkedlist.MyLinkedList.*;

/**
 * Notes: Reverse LinkedList
 * 1. next = current.next
 * 2. current.next = previous;
 * 3. previous = current;
 * 4. current = next;
 */
public class ReverseLinkedList {

    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.head = new Node(1);
        myLinkedList.head.next = new Node(2);
        myLinkedList.head.next.next = new Node(3);

        printLinkedList(myLinkedList);
        reverseLinkedList(myLinkedList);
        printLinkedList(myLinkedList);
    }

    private static void reverseLinkedList(MyLinkedList myLinkedList) {

        // Initialize three pointers
        Node previous = null;
        Node current = myLinkedList.head;
        Node next = null;

        while (current != null) {
            // store current.next in next pointer
            next = current.next;

            // assign previous pointer to current.next
            current.next = previous;

            //store current into previous
            previous = current;

            //assign next to current
            current = next;

        }
        // making last node as head, hence assigning previous
        myLinkedList.head = previous;

    }

    private static void printLinkedList(MyLinkedList myLinkedList) {
        Node h = myLinkedList.head;

        while (myLinkedList.head != null) {
            System.out.print(myLinkedList.head.data + " ");
            myLinkedList.head = myLinkedList.head.next;
        }
        System.out.println();
        myLinkedList.head = h;

    }

}

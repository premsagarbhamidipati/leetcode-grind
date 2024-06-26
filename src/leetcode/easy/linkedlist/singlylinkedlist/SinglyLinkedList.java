package leetcode.easy.linkedlist.singlylinkedlist;

public class SinglyLinkedList {

    // instance variable
    private ListNode head;

    // static inner class
    private static class ListNode<T> {
        //instance variables
        private T data;
        private ListNode<T> next;


        // constructor
        public ListNode(T data) {
            this.data = data;
            this.next = null;
        }
    }


    public static void main(String[] args) {
        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
        singlyLinkedList.head = new ListNode(10);
        ListNode second = new ListNode(1);
        ListNode third = new ListNode(8);
        ListNode fourth = new ListNode(11);

        // Now we will connect them together to form a chain
        // assign second node to head's next
        singlyLinkedList.head.next = second;

        // assign third node to second's next
        second.next = third;

        // assign fourth node to third's next
        third.next = fourth;
    }

}

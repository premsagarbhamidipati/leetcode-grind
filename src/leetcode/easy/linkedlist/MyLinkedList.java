package leetcode.easy.linkedlist;

public class MyLinkedList {

    public Node head;

    public static class Node {
        Node next;
        int data;
        Node(int data) {
            this.data = data;
            next = null;
        }
    }
}

package leetcode.easy.linkedlist;


/**
 * LeetCode #21
 * Time Complexity: O(m+n) where m and n are lengths of both linked lists
 * Space Complexity: O(1) constant space
 */
public class MergeTwoSortedLinkedLists {

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public static void main(String[] args) {

        // Example usage
        ListNode list1 = new ListNode(1);
        list1.next = new ListNode(3);
        list1.next.next = new ListNode(6);

        ListNode list2 = new ListNode(2);
        list2.next = new ListNode(4);
        //list2.next.next = new ListNode(5);

        //merge the lists
        ListNode mergedList = mergeTwoLists(list1, list2);
        System.out.println("Merged List: ");
        printList(mergedList);


    }

    private static void printList(ListNode head) {
        while (head != null) {
            System.out.println(head.val + " ");
            head = head.next;
        }
        System.out.println();
    }

    private static ListNode mergeTwoLists(ListNode l1, ListNode l2) {

        // Create a dummy node to simplify the code
        ListNode dummy_node = new ListNode(0);
        ListNode tail = dummy_node;


        // Iterate while both lists are not empty
        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                tail.next = l1;
                l1 = l1.next;
            } else {
                tail.next = l2;
                l2 = l2.next;
            }
            tail = tail.next;
        }

        // If one list is not empty, append the remaining nodes
        if (l1 != null) {
            tail.next = l1;
        } else {
            tail.next = l2;
        }
        return dummy_node.next;
    }


}

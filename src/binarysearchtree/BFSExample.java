package binarysearchtree;

import java.util.LinkedList;
import java.util.Queue;

/**
 * if root is null, return
 * otherwise push the root in Queue
 * Loop and check if queue is not empty
 * Pop the node from the queue i.e. queue.remove()
 * Print the node's data and add its left and right child
 * Repeat until the queue is empty
 */
public class BFSExample {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(10);
        root.right = new TreeNode(15);
        root.left.left = new TreeNode(20);
        root.left.right = new TreeNode(25);
        root.right.left = new TreeNode(30);
        root.right.right = new TreeNode(35);

        System.out.println("Breadth First Search : ");
        levelOrderQueue(root);
    }

    public static void levelOrderQueue(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();

        // if root is null
        if (root == null) {
            return;
        }

        // add root to queue
        queue.add(root);

        // loop the queue if queue is not empty
        while (!queue.isEmpty()) {
            //pop the node from the queue
            TreeNode treeNode = queue.remove();

            System.out.print(" " + treeNode.value);
            if (treeNode.left != null) {
                queue.add(treeNode.left);
            }
            if (treeNode.right != null) {
                queue.add(treeNode.right);
            }

        }
    }



}

class TreeNode {
    int value;
    TreeNode left, right;

    // constructor
    TreeNode(int value) {
        this.value = value;
        left = null;
        right = null;
    }
}

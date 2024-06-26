package binarysearchtree;

/**
 * Recursive way to insert a node into a binary search tree
 */
public class BSTInsertion {

    private TreeNode root;

    private class TreeNode {
        private int data;
        private TreeNode left;
        private TreeNode right;

        public TreeNode(int data) {
            this.data = data;
        }
    }

    public void insert(int val) {
        root = insert(root, val);
    }

    public TreeNode insert(TreeNode root, int val) {
        // Base case
        if (root == null) {
            root = new TreeNode(val);
            return root;
        }

        // if root != null
        if (val < root.data) {
            // traverse to left
            root.left = insert(root.left, val);
        } else { // val > root's val
            root.right = insert(root.right, val);
        }

        return root;
    }

    public void inOrderTraversal() {
        inOrderTraversal(root);
    }

    // if we do inorder traversal of a binary search tree, then we print it in
    // sorted form
    public void inOrderTraversal(TreeNode root) {
        // check if root == null, return
        if (root == null) {
            return;
        }

        // in this traversal, first we visit the left subtree of the root
        inOrderTraversal(root.left);
        System.out.print(root.data + "  ");
        inOrderTraversal(root.right);
    }

    public static void main(String[] args) {
        BSTInsertion bstInsertion = new BSTInsertion();
        bstInsertion.insert(5);
        bstInsertion.insert(3);
        bstInsertion.insert(7);
        bstInsertion.insert(1);

        bstInsertion.inOrderTraversal();
    }

}

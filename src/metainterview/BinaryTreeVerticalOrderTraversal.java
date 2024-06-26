package metainterview;

import java.util.*;


/**
 * Breadth First Search
 * Use Queue
 */

public class BinaryTreeVerticalOrderTraversal {

    public static void main(String[] args) {

        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);
        List<List<Integer>> res = verticalOrder(root);

        System.out.println(Arrays.asList(res));

    }

    private static List<List<Integer>> verticalOrder(TreeNode root) {

        // initialize List<List<Integer>>
        List<List<Integer>> res = new ArrayList<>();

        // check if root == null, then return the res;
        if (root == null) {
            return res;
        }

        // map's key is column, we assume the root column is zero, the left node will
        // minus 1 and right node will plus 1
        Map<Integer, ArrayList<Integer>> map = new HashMap<Integer, ArrayList<Integer>>();
        Queue<TreeNode> queue = new LinkedList<>();

        // use HashMap to store the TreeNode and the according column value
        Map<TreeNode, Integer> weight = new HashMap<TreeNode, Integer>();

        // add root to the queue
        queue.offer(root);

        // add treenode as key and value
        weight.put(root, 0);
        int min = 0;

        // Loop the queue , remove node from the queue and add node data to the map + add left child to queue and right child to the queue
        while (!queue.isEmpty()) {
            // pop the node from the queue
            TreeNode node = queue.poll();
            int w = weight.get(node);

            if (!map.containsKey(w)) {
                map.put(w, new ArrayList<>());
            }
            map.get(w).add(node.val);

            if (node.left != null) {
                queue.add(node.left);
                weight.put(node.left, w - 1);
            }

            if (node.right != null) {
                queue.add(node.right);
                weight.put(node.right, w + 1);
            }

            // update min, min means the minimum column value, which is the left most node.
            min = Math.min(min, w);
        }

        while (map.containsKey(min)) {
            res.add(map.get(min++));
        }
        return res;
    }

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        // create constructor
        public TreeNode() {
        }

        public TreeNode(int val) {
            this.val = val;
        }

        public TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }

    }

}

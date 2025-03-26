 import java.util.*;

class TreeNode {
    int val;
    TreeNode left, right;
    TreeNode(int x) { val = x; }
}

public class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        zigzag(root, res);
        return res;
    }

    public static void zigzag(TreeNode root, List<List<Integer>> res) {
        if (root == null) return;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        boolean isValid = true; // Corrected variable name

        while (!queue.isEmpty()) {
            int n = queue.size();
            LinkedList<Integer> curr = new LinkedList<>(); // Changed to LinkedList

            for (int i = 0; i < n; i++) {
                TreeNode node = queue.poll();
                if (isValid) {
                    curr.addLast(node.val); // Works with LinkedList
                } else {
                    curr.addFirst(node.val); // Works with LinkedList
                }

                if (node.left != null) queue.offer(node.left);
                if (node.right != null) queue.offer(node.right);
            }

            res.add(curr);
            isValid = !isValid; // Toggle direction
        }
    }

    
}

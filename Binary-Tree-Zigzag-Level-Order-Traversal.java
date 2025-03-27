 public class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        zigzag(root, res);
        return res;
    }

    public static void zigzag(TreeNode root, List<List<Integer>> res) {
        if(root == null)return;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        boolean isValid = true;
        while(!queue.isEmpty()){
            int n = queue.size();
            List<Integer> curr = new ArrayList<>();
            for(int i=0; i<n; i++){
                TreeNode node = queue.poll();
                if(isValid){
                    curr.addLast(node.val);
                }else{
                    curr.addFirst(node.val);
                }
                if(node.left != null)queue.add(node.left);
                if(node.right != null)queue.add(node.right);
            }
            isValid= !isValid;
            res.add(curr);
        }
    }
}

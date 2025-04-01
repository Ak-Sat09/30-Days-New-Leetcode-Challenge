class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
       
       List<List<Integer>> res = new ArrayList<>();
         if(root == null)return res;
       Queue<TreeNode> queue = new LinkedList<>();
       queue.offer(root);
       while(!queue.isEmpty()){
        int n = queue.size();
        List<Integer> list = new ArrayList<>();
        for(int i=0; i<n; i++){
            TreeNode node = queue.poll();
            list.add(node.val);
            if(node.left != null)queue.add(node.left);
                        if(node.right != null)queue.add(node.right);
        }
        res.add(list);
       }
       return res;
    }
}

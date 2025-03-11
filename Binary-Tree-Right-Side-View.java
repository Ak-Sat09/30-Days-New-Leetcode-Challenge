 class Solution {
    public static void dfs(TreeNode root , int i , List<Integer> res){
        if(root == null)return;
        if(i == res.size()){
            res.add(root.val);
        }
         dfs(root.right , i+1 , res);
        dfs(root.left , i+1 , res);
    }
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        dfs(root,0,res);
        return res;
       
           }
}

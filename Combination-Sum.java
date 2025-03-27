class Solution {
   public List<List<Integer>> combinationSum(int[] nums, int target) {
    List<List<Integer>> res = new ArrayList<>();
    List<Integer> curr = new ArrayList<>();
    backtrack(res,curr,nums,0,target,0);
    return res;
}

private void backtrack(List<List<Integer>> res, List<Integer> curr, int [] arr , int sum , int target,int idx){
    if(sum == target){
        res.add(new ArrayList<>(curr));
        return;
    }
    if(sum > target)return;
    for(int i=idx; i<arr.length; i++){
        if(i > idx && arr[i] == arr[i-1])continue;

        curr.add(arr[i]);
        backtrack(res,curr,arr,sum+arr[i],target,i);
        curr.remove(curr.size()-1);
    }
}
}
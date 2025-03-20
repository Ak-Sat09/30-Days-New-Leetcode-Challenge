 import java.util.*;

class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);  // Sort to handle duplicates
        backtrack(0, nums, new ArrayList<>(), result);
        return result;
    }

    private void backtrack(int start, int[] arr, List<Integer> list, List<List<Integer>> res) {
      res.add(new ArrayList<>(list));
      for(int i=start; i<arr.length; i++){
        if(i>start && arr[i] == arr[i-1]){
            continue;
        }
        list.add(arr[i]);
        backtrack(i+1,arr,list,res);
        list.remove(list.size()-1);
      }
    }
}

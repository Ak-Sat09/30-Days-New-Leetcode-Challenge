 class Solution {
    public int[] dailyTemperatures(int[] arr) {
      int n = arr.length;
      int res[] = new int[n];
      Stack<Integer> stack = new Stack<>();
      for(int i=0; i<n; i++){
        while(!stack.isEmpty() && arr[stack.peek()] < arr[i]){
            int idx = stack.pop();
            res[idx] = i-idx;
        }
        stack.push(i);
      }
      return res;
    }
}
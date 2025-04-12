 class Solution {
    public int[] dailyTemperatures(int[] arr) {
     Stack<Integer> stack = new Stack<>();
     int n = arr.length;
     int res[] = new int[n];
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
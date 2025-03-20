 class Solution {
    public int[] dailyTemperatures(int[] arr) {
        int n = arr.length;
        int res[] = new int[n];

        Stack<Integer> stack = new Stack<>();
        for(int i=0; i<arr.length; i++){
            while(!stack.isEmpty() && arr[i] > arr[stack.peek()]){
                int last = stack.pop();
                res[last] = i-last;
            }
            stack.push(i);
        }
        return res;
    }
}
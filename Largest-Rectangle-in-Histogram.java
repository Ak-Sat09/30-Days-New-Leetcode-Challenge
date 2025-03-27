class Solution {
    public int largestRectangleArea(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        int n = arr.length;
        int maxArea = 0;
        for(int i=0; i<=n; i++){
            int h = 0;
            if(i == n){
                h = 0;
            }else{
                h = arr[i];
            }
            while(!stack.isEmpty() && arr[stack.peek()] > h){
                int height = arr[stack.pop()];
                int width = 0;
                if(stack.isEmpty()){
                    width = i;
                }else{
                    width = i-stack.peek()-1;
                }
                maxArea = Math.max(maxArea , height*width);
            }
            stack.push(i);
        }
        return maxArea;
    }
}
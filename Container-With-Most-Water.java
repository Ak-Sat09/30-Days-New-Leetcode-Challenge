 class Solution {
    public int maxArea(int[] arr) {
      int n = arr.length;
      int left = 0 , right = n-1 , maxArea = 0;
      while(left < right){
        int minhgt = Math.min(arr[left],arr[right]);
        int width = right-left;
        int area = minhgt*width;
        maxArea = Math.max(maxArea , area);
        if(arr[left] < arr[right]){
            left++;
        }
        else{
            right--;
        }
      }
      return maxArea;
    }
}

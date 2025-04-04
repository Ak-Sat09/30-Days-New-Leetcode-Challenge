 class Solution {
    public int[] productExceptSelf(int[] arr) {
      int n = arr.length;
      int ans[] = new int[n];
      ans[0] = 1;
      for(int i=1; i<arr.length; i++){
        ans[i] = ans[i-1]*arr[i-1];
      }
      int suffix = 1;
      for(int i=n-1; i>=0; i--){
        ans[i] = ans[i]*suffix;
        suffix = suffix*arr[i];
      }
      return ans;
    }
}

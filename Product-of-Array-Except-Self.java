 class Solution {
    public int[] productExceptSelf(int[] arr) {
        int n = arr.length;
        int[] res = new int[n];
        res[0] = 1;

      for (int i = 1; i < n; i++) {
            res[i] = arr[i - 1] * res[i - 1];
            
            }

            int suffix = 1;

            for(int i=n-1; i>=0; i--){
                res[i] = suffix*res[i];
                suffix = suffix*arr[i];
            }

            return res;
    }
}

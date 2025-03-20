class Solution {
    public int maxSubArray(int[] arr) {
          int curr = 0;
        int max = arr[0];

        for(int i=0; i<arr.length; i++){
            curr = Math.max(arr[i],curr+arr[i]);
            max = Math.max(curr, max);
        }
        return max;
        }
}

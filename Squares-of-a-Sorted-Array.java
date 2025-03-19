 class Solution {
    public int[] sortedSquares(int[] arr) {
       int n = arr.length;
       int res[] = new int[n];
       int left = 0;
       int right = n-1;
       int idx = n-1;

       while(left <= right){
        int leftsqrt = arr[left] * arr[left];
        int rightsqrt = arr[right] * arr[right];

        if(leftsqrt > rightsqrt){
            res[idx] = leftsqrt;
            idx--;
            left++;
        }
        else{
            res[idx] = rightsqrt;
            idx--;
            right--;
        }
       }
       return res;
    }
}

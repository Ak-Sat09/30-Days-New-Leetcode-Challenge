 class Solution {
    public int maxArea(int[] arr) {
    int n = arr.length;
    int left = 0;
    int right = n-1;
    int maxLen = 0;
    while(left<=right){
        int hgt = Math.min(arr[left],arr[right]);
        int wdt = right-left;
        int area = hgt*wdt;

        maxLen = Math.max(maxLen,area);
        if(arr[left] < arr[right]){
            left++;
        }else{
            right--;
        }
    }
    return maxLen;
    }
}

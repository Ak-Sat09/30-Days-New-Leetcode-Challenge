 class Solution {
    public int maxArea(int[] arr) {
    int n = arr.length;
    int i = 0;
    int j= n-1;
    int maxArea = 0;
    while(i < j){
        int hgt = Math.min(arr[i],arr[j]);
        int wdt = j-i;
        int area= wdt*hgt;
        maxArea = Math.max(maxArea,area);
        if(arr[i]<arr[j]){
            i++;
        }else{
            j--;
        }
    }
    return maxArea;
    }
}

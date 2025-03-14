class Solution {
    public int maxProfit(int[] arr) {
     int minPrice = arr[0];
     int profit = 0;
     for(int i=0; i<arr.length; i++){
        if(arr[i] < minPrice){
            minPrice = arr[i];
        }
        profit = Math.max(profit , arr[i]-minPrice);
     }
     return profit;
    }
}
 
class Solution {
    public int minEatingSpeed(int[] arr, int h) {
        
        int low  = 1 , high = Integer.MAX_VALUE;
        for(int i : arr){
            high = Math.max(high , i);
        }
        int res = 0;
        while(low <= high){
            int mid = low +(high-low)/2;
            int hrs = 0;
            for(int i : arr){
                if(i % mid == 0){
                    hrs += i/mid;
                }
                else{
                    hrs += (i/mid)+1;
                }
            }
            if(hrs <= h){
                res = mid;
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        return res;
    }
}
class Solution {
    public int majorityElement(int[] arr) {
        int n = arr.length;
        int can = arr[0];
        int count = 0;
        for(int i : arr){
            if(count == 0){
                can = i;
                count = 1;
            }else if(i == can){
                count++;
            }
            else{
                count--;
            }
        }
        int freq = 0;
        for(int i : arr){
            if(i == can){
                freq++;
            }
        }

        if(freq > n/2){
            return can;
        }
        return -1;
    }
}
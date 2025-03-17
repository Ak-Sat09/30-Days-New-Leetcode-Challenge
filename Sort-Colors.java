 class Solution {
    public void sortColors(int[] arr) {
       int count0 = 0;
       int count1 = 0;
       int count2 = 0;

       for(int i=0; i<arr.length; i++){
        if(arr[i] == 0){
            count0++;
        }
        else if(arr[i] == 1){
            count1++;
        }
        else{
            count2++;
        }
       }
       for(int i=0; i<arr.length; i++){
        if(i<count0){
            arr[i] = 0;
        }else if(i < count0+count1){
            arr[i] = 1;
        }
        else{
            arr[i] = 2;
        }
       }
    }
}

class Solution {
    public int longestConsecutive(int[] arr) {
        if (arr.length == 0) return 0;
        Arrays.sort(arr);
        int count = 1;
        int max = 1;
        for(int j=1; j<arr.length; j++){
            if(arr[j] == arr[j-1]){
                continue;
            }
            else if(arr[j] == arr[j-1]+1){
                count++;
            }
            else{
                count = 1;
            }
            max = Math.max(max, count);
        }
        return max;
    }
}

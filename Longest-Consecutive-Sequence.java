class Solution {
    public int longestConsecutive(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        for(int i : arr){
            set.add(i);
        }
        int maxLen = 0;
        for(int i : set){
            if(!set.contains(i-1)){
                int currNum = i;
                int count = 1;

                while(set.contains(currNum+1)){
                    currNum++;
                    count++;
                }
            
            maxLen = Math.max(maxLen , count);
            }
        }
        return maxLen;
    }
}
 
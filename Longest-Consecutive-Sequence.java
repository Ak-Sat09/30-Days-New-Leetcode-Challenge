class Solution {
    public int longestConsecutive(int[] arr) {
        if (arr.length == 0) return 0;
        HashSet<Integer> set = new HashSet<>();
        for(int i : arr){
            set.add(i);
        }
        int longest = 0;
        for(int i : set){
            if(!set.contains(i - 1)){
                int curr = i;
                int count = 1;

                while(set.contains(curr+1)){
                    curr = curr+1;
                    count++;
                }
                longest = Math.max(longest,count);
            }
        }
        return longest;
    }
}

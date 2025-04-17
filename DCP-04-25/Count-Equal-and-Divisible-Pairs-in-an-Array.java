class Solution {
        public int countPairs(int[] nums, int k) {
        int cnt = 0;
        Map<Integer, List<Integer>> indices = new HashMap<>();
        for (int i = 0; i < nums.length; ++i) {
            for (int j : indices.getOrDefault(nums[i], List.of())) {
                cnt += i * j % k == 0 ? 1 : 0;
            }
            indices.computeIfAbsent(nums[i], s -> new ArrayList<>()).add(i);
        }
        return cnt;        
    }
}
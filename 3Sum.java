class Solution {
   public List<List<Integer>> threeSum(int[] arr) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(arr); // Sorting is required for the two-pointer approach

        for (int i = 0; i < arr.length - 2; i++) { 
            if (i > 0 && arr[i] == arr[i - 1]) continue; // Skip duplicate values for i

            int left = i + 1, right = arr.length - 1;

            while (left < right) {
                int sum = arr[i] + arr[left] + arr[right];

                if (sum == 0) {
                    res.add(Arrays.asList(arr[i], arr[left], arr[right]));

                    // Move `left` and `right` to avoid duplicates
                    while (left < right && arr[left] == arr[left + 1]) left++; 
                    while (left < right && arr[right] == arr[right - 1]) right--; 

                    left++; 
                    right--;
                } 
                else if (sum < 0) left++; // Increase sum
                else right--; // Decrease sum
            }
        }
        return res;
    }
}


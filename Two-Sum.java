import java.util.*;

class Solution {
    public int[] twoSum(int[] arr, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for (int i = 0; i < arr.length; i++) {  // Corrected loop
            int comp = target - arr[i]; // Calculate complement
            
            if (map.containsKey(comp)) {  // Check if complement exists
                return new int[]{i, map.get(comp)}; 
            }
            
            map.put(arr[i], i);  // Store the element and its index
        }
        
        return new int[]{};  // Return an empty array if no pair is found
    }
}

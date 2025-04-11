 public class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] result = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            boolean found = false;
            // Use a pointer to iterate through nums2
            for (int j = 0; j < nums2.length; j++) {
                if (nums2[j] == nums1[i]) {
                    // Start from the next element in nums2 to find the next greater element
                    for (int k = j + 1; k < nums2.length; k++) {
                        if (nums2[k] > nums1[i]) {
                            result[i] = nums2[k];
                            found = true;
                            break;
                        }
                    }
                    break;
                }
            }
            // If no greater element is found, set result to -1
            if (!found) {
                result[i] = -1;
            }
        }
        
        return result;
    }
}

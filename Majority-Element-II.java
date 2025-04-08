import java.util.*;

class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int can1 = -1, can2 = -1;
        int count1 = 0, count2 = 0;

        // Step 1: Find 2 possible majority candidates
        for (int i : nums) {
            if (i == can1) {
                count1++;
            } else if (i == can2) {
                count2++;
            } else if (count1 == 0) {
                can1 = i;
                count1 = 1;
            } else if (count2 == 0) {
                can2 = i;
                count2 = 1;
            } else {
                count1--;
                count2--;
            }
        }

        // Step 2: Count actual frequencies of candidates
        count1 = 0;
        count2 = 0;

        for (int num : nums) {
            if (num == can1) {
                count1++;
            } else if (num == can2) {
                count2++;
            }
        }

        // Step 3: Add valid candidates to result
        List<Integer> result = new ArrayList<>();
        int n = nums.length;

        if (count1 > n / 3) {
            result.add(can1);
        }
        if (count2 > n / 3) {
            result.add(can2);
        }

        return result;
    }
}

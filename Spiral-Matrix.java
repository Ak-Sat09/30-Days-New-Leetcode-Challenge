 import java.util.*;

class Solution {
    public List<Integer> spiralOrder(int[][] arr) {
        List<Integer> res = new ArrayList<>();
        if (arr == null || arr.length == 0) return res;

        int top = 0, bottom = arr.length - 1;
        int left = 0, right = arr[0].length - 1; // ✅ Corrected initialization

        while (left <= right && top <= bottom) {
            // Move from Left to Right →
            for (int i = left; i <= right; i++) {
                res.add(arr[top][i]);
            }
            top++; // Move downward

            // Move from Top to Bottom ↓
            for (int i = top; i <= bottom; i++) {
                res.add(arr[i][right]);
            }
            right--; // Move left

            // Move from Right to Left ← (Check if `top <= bottom`)
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    res.add(arr[bottom][i]);
                }
                bottom--; // Move up
            }

            // Move from Bottom to Top ↑ (Check if `left <= right`)
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    res.add(arr[i][left]);
                }
                left++; // Move right
            }
        }

        return res;
    }

   
}

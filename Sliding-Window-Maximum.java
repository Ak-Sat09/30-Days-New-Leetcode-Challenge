 import java.util.*;

public class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        Deque<Integer> deque = new LinkedList<>();
        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            // Remove from front if out of window
            if (!deque.isEmpty() && deque.peekFirst() == i - k)
                deque.pollFirst();

            // Remove smaller elements from back
            while (!deque.isEmpty() && nums[deque.peekLast()] < nums[i])
                deque.pollLast();

            // Add current index
            deque.offerLast(i);

            // Add max to result when window hits size k
            if (i >= k - 1)
                result.add(nums[deque.peekFirst()]);
        }

        // Convert list to array
        int[] ans = new int[result.size()];
        for (int i = 0; i < result.size(); i++)
            ans[i] = result.get(i);

        return ans;
    }
}

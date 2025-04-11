 import java.util.*;

class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();

        for (int i : asteroids) {
            boolean destroyed = false;

            while (!stack.isEmpty() && i < 0 && stack.peek() > 0) {
                if (stack.peek() < -i) {
                    stack.pop();
                    continue;
                } else if (stack.peek() == -i) {
                    stack.pop();
                }
                destroyed = true;
                break;
            }

            if (!destroyed) {
                stack.push(i);
            }
        }

        // Convert stack to array
        int[] result = new int[stack.size()];
        for (int j = stack.size() - 1; j >= 0; j--) {
            result[j] = stack.pop();
        }

        return result;
    }
}

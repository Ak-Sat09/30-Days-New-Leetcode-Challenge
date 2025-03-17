 import java.util.Stack;

class Solution {
    public String removeKdigits(String num, int k) {
        Stack<Character> stack = new Stack<>();

        // Step 1: Traverse through each character in num
        for (char ch : num.toCharArray()) {
            // Step 2: Remove elements from stack if they are greater than current digit
            while (!stack.isEmpty() && k > 0 && stack.peek() > ch) {
                stack.pop();
                k--;
            }
            stack.push(ch); // Step 3: Push current digit into stack
        }

        // Step 4: Remove remaining digits if k > 0
        while (k > 0 && !stack.isEmpty()) {
            stack.pop();
            k--;
        }

        // Step 5: Build the final result
        StringBuilder result = new StringBuilder();
        for (char digit : stack) {
            result.append(digit);
        }

        // Step 6: Remove leading zeros
        while (result.length() > 0 && result.charAt(0) == '0') {
            result.deleteCharAt(0);
        }

        // Step 7: Return the final result, or \0\ if empty
        return result.length() == 0 ? \0\ : result.toString();
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.removeKdigits(\1432219\, 3)); // Output: \1219\
        System.out.println(sol.removeKdigits(\10200\, 1));   // Output: \200\
        System.out.println(sol.removeKdigits(\10\, 2));      // Output: \0\
        System.out.println(sol.removeKdigits(\123456789\, 5)); // Output: \1234\
    }
}

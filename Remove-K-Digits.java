import java.util.Stack;

class Solution {
    public String removeKdigits(String str, int k) {
        Stack<Character> stack = new Stack<>();
        
        for (char ch : str.toCharArray()) {
            while (!stack.isEmpty() && k > 0 && stack.peek() > ch) {
                stack.pop();
                k--;
            }
            stack.push(ch); // Push the current digit
        }

        // Remove remaining k elements from the end if needed
        while (k > 0 && !stack.isEmpty()) {
            stack.pop();
            k--;
        }

        // Build result string
        StringBuilder res = new StringBuilder();
        for (char c : stack) {
            res.append(c);
        }

        // Remove leading zeros
        while (res.length() > 0 && res.charAt(0) == '0') {
            res.deleteCharAt(0);
        }

        return res.length() == 0 ? \0\ : res.toString();
    }
}

 class Solution {
    public boolean isPalindrome(int x) {
        // Early return for negative numbers or multiples of 10 (except 0)
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }

        int y = x;
        int rev = 0;
        while (x != 0) {
            int digit = x % 10;
            rev = rev * 10 + digit;
            x = x / 10;
        }

        return y == rev;
    }
}

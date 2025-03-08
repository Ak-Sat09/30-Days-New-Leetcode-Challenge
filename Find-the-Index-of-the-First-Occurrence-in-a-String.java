 class Solution {
    public int strStr(String haystack, String needle) {
        // If needle is empty, return 0
        if (needle.isEmpty()) {
            return 0;
        }

        // Loop through haystack and check for substring match
        for (int i = 0; i <= haystack.length() - needle.length(); i++) {
            // Compare substring of length needle.length() starting at index i
            if (haystack.substring(i, i + needle.length()).equals(needle)) {
                return i;  // Return index of the match
            }
        }

        // Return -1 if no match found
        return -1;
    }
}

 public class Solution {
    public boolean isPalindrome(String str) { 
        char[] arr = str.replaceAll(\[^a-zA-Z0-9]\, \\).toLowerCase().toCharArray(); 
        return pali(arr , 0 , arr.length-1);
    }

    private boolean pali(char[] arr, int left, int right) {
      if(left > right)return true;
      if(arr[left] != arr[right])return false;
      return pali(arr,left+1,right-1);
    }
}

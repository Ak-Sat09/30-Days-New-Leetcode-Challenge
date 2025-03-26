 class Solution {
    public static void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void rev(int arr[], int i, int j) {
        while (i < j) {
            swap(arr, i, j);
            i++;
            j--;
        }
    }

    public void nextPermutation(int[] arr) {
        int n = arr.length;
        int i = n - 2;

        // Step 1: Find the first decreasing element from the right
        while (i >= 0 && arr[i] >= arr[i + 1]) {
            i--;
        }

        // Step 2: Find the next greater element to swap with arr[i]
        if (i >= 0) {
            int j = n - 1;
            while (arr[j] <= arr[i]) {  // Fix: Changed \<\ to \<=\
                j--;
            }
            swap(arr, i, j);
        }

        // Step 3: Reverse the right part to get the next smallest lexicographic order
        rev(arr, i + 1, n - 1);
    }
}

class Solution {
    public int maxProduct(int[] arr) {
        int maxProd = arr[0];
        int currMax = arr[0];
        int currMin = arr[0];

        for (int i = 1; i < arr.length; i++) { // Start from index 1
            if (arr[i] < 0) { 
                int temp = currMax;
                currMax = currMin;
                currMin = temp;
            }

            currMax = Math.max(arr[i], currMax * arr[i]);
            currMin = Math.min(arr[i], currMin * arr[i]);

            maxProd = Math.max(maxProd, currMax);
        }
        return maxProd;
    }
}

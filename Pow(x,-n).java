 class Solution {
    public double myPow(double x, int n) {
        // Handle the case when n is negative
        if (n < 0) {
            x = 1 / x;
            n = -n;  // Convert n to positive for easier calculation
        }
        return pow(x, n);
    }

    private double pow(double x, int n) {
        // Base case: If n is 0, return 1 (x^0 = 1)
        if (n == 0) {
            return 1.0;
        }
        
        // Recursive call: Calculate x^(n/2)
        double half = pow(x, n / 2);
        
        // If n is even, return half * half (x^n = (x^(n/2))^2)
        if (n % 2 == 0) {
            return half * half;
        } else {
            // If n is odd, return x * half * half (x^n = x * (x^(n-1)/2))^2)
            return x * half * half;
        }
    }
}

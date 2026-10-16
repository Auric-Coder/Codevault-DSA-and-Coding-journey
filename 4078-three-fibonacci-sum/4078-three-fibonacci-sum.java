class Solution {
    public boolean threeFibonacciSum(int n) {
        if(n%2!=0) return false;
        int x = n/2;
        int a = 0, b=1;
        while(a<x){
            int c = a+b;
            a = b;
            b = c;
        }
        return a == x;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna
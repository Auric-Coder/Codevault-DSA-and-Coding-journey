class Solution {
    public int fib(int n) {
        if(n <= 1) return n;
        int a = 0, b = 1;
        for(int i=2; i<=n; i++){
            int c = a + b;
            a = b;
            b = c;
        }
        return b;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna
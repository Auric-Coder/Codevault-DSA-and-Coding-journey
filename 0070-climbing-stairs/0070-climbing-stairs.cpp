class Solution {
public:
    int climbStairs(int n) {
        if (n <= 1) return 1;
        int a = 1, b = 1;
        while (n-- > 1) {
            int t = a + b;
            a = b;
            b = t;
        }
        return b;
    }
};

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna
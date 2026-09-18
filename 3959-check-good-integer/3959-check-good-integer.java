class Solution {
    public boolean checkGoodInteger(int n) {
        int dsum = 0, ssum = 0;
        while(n>0){
            int d = n%10;
            dsum += d;
            ssum += d*d;
            n /= 10;
        }
        return ssum-dsum >= 50;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna
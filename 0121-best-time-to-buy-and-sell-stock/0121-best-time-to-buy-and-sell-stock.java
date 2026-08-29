class Solution {
    public int maxProfit(int[] prices) {
        int minp = prices[0];
        int maxp = 0;
        for(int i=1; i<prices.length; i++){
            minp = Math.min(minp, prices[i]);
            int profit = prices[i]-minp;
            maxp = Math.max(maxp, profit);
        }
        return maxp;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna
class Solution {
    public int countCommas(int n) {
        int ans = 0, s = 1000, c = 1;
        while(s<=n){
            int end = Math.min(n, s*1000-1);
            ans+=(end-s+1)*c;
            s*=1000;
            c++;
        }
        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna
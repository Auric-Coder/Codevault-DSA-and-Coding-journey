class Solution {
    public int countDigitOccurrences(int[] nums, int digit) {
        int c = 0;
        for(int i: nums){
            while(i!=0){
                int d = i%10;
                if(d==digit) c++;
                i/=10;
            }
        }
        return c;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna
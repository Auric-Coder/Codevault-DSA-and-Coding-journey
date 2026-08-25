class Solution {
    public int missingMultiple(int[] nums, int k) {
        int n = k;
        while(true){
            boolean flag = false;
            for(int i : nums){
                if(i==n){
                    flag = true;
                    break;
                }
            }
            if(!flag){
                return n;
            }
            n+=k;
        }
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna
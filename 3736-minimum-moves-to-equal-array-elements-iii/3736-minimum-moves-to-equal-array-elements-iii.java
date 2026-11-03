class Solution {
    public int minMoves(int[] nums) {
        int max = nums[0], mov = 0;
        for(int i: nums){
            max = Math.max(max, i);
        }
        for(int i: nums){
            mov += max - i;
        }
        return mov;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna
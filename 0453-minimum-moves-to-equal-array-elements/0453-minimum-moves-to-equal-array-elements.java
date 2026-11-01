class Solution {
    public int minMoves(int[] nums) {
        int min = nums[0], sum = 0;
        for(int i : nums){
            min = Math.min(min, i);
            sum+=i;
        }
        return sum-nums.length*min;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna
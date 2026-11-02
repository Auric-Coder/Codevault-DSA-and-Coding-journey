class Solution {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int mid = nums[nums.length/2];
        int mov = 0;
        for(int i: nums){
            mov += Math.abs(mid-i);
        }
        return mov;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna
class Solution {
    public int maxSum(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int n : nums){
            if(n > 0)set.add(n);
        }
        if(!set.isEmpty()){
            int sum = 0;
            for(int n : set) sum += n;
            return sum;
        }
        int max = nums[0];
        for(int n : nums) max = Math.max(max, n);
        return max;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna
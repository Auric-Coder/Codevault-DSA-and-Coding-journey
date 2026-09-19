class Solution {
    public int[] concatWithReverse(int[] nums) {
        int[] arr = new int[nums.length*2];
        for(int i=0; i<nums.length; i++){
            arr[i]=nums[i];
            arr[i+nums.length] = nums[nums.length-i-1];
        }
        return arr;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna
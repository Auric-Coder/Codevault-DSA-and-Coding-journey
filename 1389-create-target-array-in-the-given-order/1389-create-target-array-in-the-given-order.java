class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        int n = nums.length;
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            for(int j = i; j > index[i]; j--){
                arr[j] = arr[j - 1];
            }
            arr[index[i]] = nums[i];
        }

        return arr;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna
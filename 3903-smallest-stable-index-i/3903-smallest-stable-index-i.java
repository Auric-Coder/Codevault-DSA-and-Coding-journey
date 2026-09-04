class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int n = nums.length;
        int[] arr1 = new int[n];
        int[] arr2 = new int[n];
        arr1[0] = nums[0];
        for(int i = 1; i<n; i++){
            arr1[i] = Math.max(arr1[i-1],nums[i]);
        }
        arr2[n-1] = nums[n-1];
        for(int i = n-2; i>=0; i--){
            arr2[i] = Math.min(arr2[i+1],nums[i]);
        }
        for(int i=0; i<n; i++){
            int sc = arr1[i] - arr2[i];
            if(sc<=k) return i;
        }
        return -1;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna
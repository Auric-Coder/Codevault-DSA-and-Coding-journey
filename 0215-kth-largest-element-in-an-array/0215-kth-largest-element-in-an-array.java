class Solution {
    public int findKthLargest(int[] nums, int k) {
        int target = nums.length - k;
        return quickSelect(nums, 0, nums.length - 1, target);
    }
    private int quickSelect(int[] nums, int i, int j, int target) {
        if(i > j) return -1;
        int[] pivot = partition(nums, i, j);
        if(target >= pivot[0] && target <= pivot[1]) {
            return nums[target];
        }
        if(target < pivot[0]) {
            return quickSelect(nums, i, pivot[0] - 1, target);
        }
        return quickSelect(nums, pivot[1] + 1, j, target);
    }
    private int[] partition(int[] nums, int i, int j) {
        int pivot = nums[j];
        int low = i;
        int n = i;
        int high = j;
        while(n <= high) {
            if(nums[n] < pivot) {
                swap(nums, n, low);
                low++;
                n++;
            }
            else if(nums[n] > pivot) {
                swap(nums, n, high);
                high--;
            }
            else {
                n++;
            }
        }
        return new int[]{low, high};
    }
    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna
class Solution {
    public boolean uniformArray(int[] nums1) {
        int minOdd = Integer.MAX_VALUE;
        for (int x : nums1) {
            if (x % 2 != 0) {
                minOdd = Math.min(minOdd, x);
            }
        }
        if (minOdd == Integer.MAX_VALUE) return true;
        for (int x : nums1) {
            if (x % 2 == 0 && x < minOdd) {
                return false;
            }
        }
        return true;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna
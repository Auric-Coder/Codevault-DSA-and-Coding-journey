class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer, Integer> hash = new HashMap<>();
        for(int i : nums){
            if(hash.containsKey(i)){
                return true;
            }
            hash.put(i, 1);
        }
        return false;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna
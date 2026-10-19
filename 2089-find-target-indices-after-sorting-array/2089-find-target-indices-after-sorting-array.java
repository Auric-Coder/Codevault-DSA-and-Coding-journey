class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        int small = 0;
        int equal = 0;
        for(int i: nums){
            if(i<target){
                small++;
            }
            else if(i==target){
                equal++;
            }
        }
        List<Integer> arr = new ArrayList<>();
        for(int i=small ; i< small+equal; i++){
            arr.add(i);
        }
        return arr;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna
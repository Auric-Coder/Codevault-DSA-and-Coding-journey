class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> list = new ArrayList<>();
        for(int i=0; i<nums.length; i++){
            int start = nums[i];
            while(i+1<nums.length && nums[i+1]==nums[i]+1){
                i++;
            }
            if(start==nums[i]){
                list.add(String.valueOf(start));
            }
            else{
                list.add(start+"->"+nums[i]);
            }
        }
        return list;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna
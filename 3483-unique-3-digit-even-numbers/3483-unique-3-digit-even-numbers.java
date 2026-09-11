class Solution {
    public int totalNumbers(int[] digits) {
        int[] hash = new int[10];
        for(int i : digits){
            hash[i]++;
        }
        int count=0;
        for(int i=100; i<=999; i+=2){
            int a = i/100;
            int b = (i/10)%10;
            int c = i%10;
            int[] nums = new int[10];
            nums[a]++;
            nums[b]++;
            nums[c]++;
            boolean flag = true;
            for(int j=0; j<10; j++){
                if(nums[j]>hash[j]){
                    flag = false;
                    break;
                }
            }
            if(flag) count++;
        }
        return count;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna
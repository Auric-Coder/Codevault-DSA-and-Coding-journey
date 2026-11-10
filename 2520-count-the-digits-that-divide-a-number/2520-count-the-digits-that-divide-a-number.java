class Solution {
    public int countDigits(int num) {
        int n = num;
        int count = 0;
        while(num > 0){
            int d = num % 10;
            if(d != 0 && n % d == 0){
                count++;
            }
            num /= 10;
        }
        return count;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna
class Solution {
    public int reverseDegree(String s) {
        int n = 0;
        for(int i=0; i<s.length(); i++){
            int a = 26 - (s.charAt(i)-'a');
            n += a*(i+1);
        }
        return n;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna
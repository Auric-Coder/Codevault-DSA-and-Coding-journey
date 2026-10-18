class Solution {
    public String toHex(int num) {
        if(num==0) return "0";
        StringBuilder hex = new StringBuilder();
        char[] d = "0123456789abcdef".toCharArray();
        while(num!=0){
            int n = num & 15;
            hex.append(d[n]);
            num>>>=4;
        }
        return hex.reverse().toString();
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna
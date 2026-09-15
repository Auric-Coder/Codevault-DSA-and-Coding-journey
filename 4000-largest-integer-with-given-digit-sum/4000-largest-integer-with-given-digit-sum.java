class Solution {
    public int largestInteger(int n, int s) {
        StringBuilder str = new StringBuilder();
        for(int i=0; i<n; i++){
            int d = Math.min(9, s);
            str.append(d);
            s -= d; 
        }
        if(s>0){
            return -1;
        }
        return Integer.parseInt(str.toString());
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna
class Solution {
    public int numOfStrings(String[] patterns, String word) {
        int n = 0;
        for(String i: patterns){
            if(word.contains(i)) n++;
        }
        return n;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna
class Solution {
    public int[] scoreValidator(String[] events) {
        int sc = 0, count = 0;
        for(String i : events){
            if(i.equals("W")){
                count++;
                if(count==10) break;
            }
            else if(i.equals("WD") || i.equals("NB")) sc++;
            else sc += Integer.parseInt(i);
        }
        return new int[]{sc, count};
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna
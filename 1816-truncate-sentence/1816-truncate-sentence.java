class Solution {
    public String truncateSentence(String s, int k) {
        String[] arr = s.split(" ");
        StringBuilder str = new StringBuilder();
        for(int i=0; i<k; i++){
            if(i>0){
                str.append(" ");
            }
            str.append(arr[i]);
        }  
        return str.toString();
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna
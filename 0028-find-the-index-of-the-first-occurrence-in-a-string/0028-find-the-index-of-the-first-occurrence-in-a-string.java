class Solution {
    public int strStr(String haystack, String needle) {
        int m = haystack.length();
        int n = needle.length();
        if (n > m) return -1;
        if (n == 0) return 0;
        int base = 26;
        int power = 1;
        for(int i=1; i<n; i++) power *= base;
        int patternHash = 0;
        for(int i=0; i<n; i++){
            patternHash = patternHash*base+needle.charAt(i);
        }
        int textHash = 0;
        for(int i=0; i<n; i++){
            textHash = textHash*base+haystack.charAt(i);
        }
        for(int i=0; i<=m-n; i++){
            if(patternHash == textHash){
                boolean found = true;
                for(int j=0; j<n; j++){
                    if(haystack.charAt(i+j) != needle.charAt(j)){
                        found = false;
                        break;
                    }
                }
                if(found) return i;
            }
            if(i < m-n){
                textHash = textHash-haystack.charAt(i)*power;
                textHash = textHash*base+haystack.charAt(i+n);
            }
        }
        return -1;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna
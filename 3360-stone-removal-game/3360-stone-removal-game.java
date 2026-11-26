class Solution {
    public boolean canAliceWin(int n) {
        int remove = 10;
        boolean alice = true;
        while(n >= remove){
            n -= remove--;
            alice = !alice;
        }
        return !alice;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna
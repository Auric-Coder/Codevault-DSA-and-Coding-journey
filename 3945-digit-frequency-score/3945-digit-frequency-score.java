class Solution {
    public int digitFrequencyScore(int n) {
        int sum = 0;
        int[] arr = new int[10];
        while(n!=0){
            int d = n%10;
            arr[d]++;
            n /=10;
        }
        for(int i=0; i<10; i++){
            sum += arr[i]*i;
        }
        return sum;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna
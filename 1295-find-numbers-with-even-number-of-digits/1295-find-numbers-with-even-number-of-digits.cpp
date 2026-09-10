class Solution {
public:
    int findNumbers(vector<int>& nums) {
        int c = 0;
        for(int i : nums){
            if(to_string(i).length()%2==0){
                c++;
            }
        }
        return c;
    }
};

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna
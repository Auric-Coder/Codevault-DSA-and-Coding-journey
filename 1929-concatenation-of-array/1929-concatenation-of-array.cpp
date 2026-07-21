class Solution {
public:
    vector<int> getConcatenation(vector<int>& nums) {
        vector<int> temp;
        for(int i=0; i<nums.size(); i++){
            temp.push_back(nums[i]);
        }
        for(int i=0; i<nums.size(); i++){
            temp.push_back(nums[i]);
        }
        return temp;
    }
};

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna
class Solution:
    def subsets(self, nums: List[int]) -> List[List[int]]:
        return [[nums[j] for j in range(len(nums)) if (i & (2**j)) != 0] for i in range(2**len(nums))]

# Synced seamlessly with LeetHub Pro
# Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
# Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna
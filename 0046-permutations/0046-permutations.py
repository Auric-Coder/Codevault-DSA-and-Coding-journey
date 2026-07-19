class Solution:
    def permute(self, nums: List[int]) -> List[List[int]]:
        def backtrack(start=0):
            if start == len(nums):
                result.append(nums[:]) 
            for i in range(start, len(nums)):
                nums[start], nums[i] = nums[i], nums[start] 
                backtrack(start + 1) 
                nums[start], nums[i] = nums[i], nums[start] 

        result = []
        backtrack()
        return result


# Synced seamlessly with LeetHub Pro
# Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
# Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna
class Solution:
    def isPalindrome(self, s: str) -> bool:
        x = ''.join(char.lower() for char in s if char.isalnum())
        return x == x[::-1]

# Synced seamlessly with LeetHub Pro
# Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
# Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna
class Solution:
    def isValid(self, s: str) -> bool:
        l = []
        dt = {')': '(', '}': '{', ']': '['}
        for i in s:
            if i in dt:
                if not l or l[-1] != dt[i]:
                    return False
                l.pop()
            else:
                l.append(i)
        return not l

# Synced seamlessly with LeetHub Pro
# Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
# Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna
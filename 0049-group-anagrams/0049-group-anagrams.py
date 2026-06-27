class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]: 
        l={}
        for i in strs:
            sort_key="".join(sorted(i))
            if sort_key not in l:
                l[sort_key]=[]
            l[sort_key].append(i)
        return list(l.values())

# Synced seamlessly with LeetHub Pro
# Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
# Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna
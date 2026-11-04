class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        Integer[] idx = new Integer[names.length];
        for(int i=0; i<idx.length; i++) idx[i]=i;
        Arrays.sort(idx, (a,b) -> Integer.compare(heights[b], heights[a]));
        String[] str = new String[names.length];
        for(int i=0; i<idx.length; i++){
            str[i] = names[idx[i]];
        }
        return str;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna
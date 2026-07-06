class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> stk = new Stack<>();
        int m = 0;
        for(int i=0; i<=heights.length; i++){
            int h = (i == heights.length) ? 0 : heights[i];
            while(!stk.isEmpty() && h<heights[stk.peek()]){
                int a = heights[stk.pop()];
                int w;
                if(stk.isEmpty()){
                    w=i;
                }
                else{
                    w=i-stk.peek()-1;
                }
                m = Math.max(m, a*w);
            }
            stk.push(i);
        }
        return m;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna
class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
        HashSet<Integer> set = new HashSet<>();
        for(int i: friends){
            set.add(i);
        }
        int[] arr = new int[friends.length];
        int idx = 0;
        for(int i: order){
            if(set.contains(i)){
                arr[idx] = i;
                idx++;
            }
        }
        return arr;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna
class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> heap = new PriorityQueue<>(Collections.reverseOrder());
        for(int i : stones){
            heap.add(i);
        }
        while(heap.size()>1){
            int x = heap.poll();
            int y = heap.poll();
            if(x!=y) heap.add(x-y);
        }
        return heap.isEmpty() ? 0 : heap.poll();
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna
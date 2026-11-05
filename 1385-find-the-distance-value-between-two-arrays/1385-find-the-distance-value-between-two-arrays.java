class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        Arrays.sort(arr2);
        int count = 0;
        for(int i: arr1){
            int l=0;
            int r=arr2.length-1;
            boolean flag = false;
            while(l<=r){
                int mid=l+(r-l)/2;
                if(Math.abs((long) i - arr2[mid]) <= d){
                    flag = true;
                    break;
                }
                else if(arr2[mid]<i){
                    l=mid+1;
                }
                else{
                    r=mid-1;
                }
            }
            if(!flag) count++;
        }
        return count;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna
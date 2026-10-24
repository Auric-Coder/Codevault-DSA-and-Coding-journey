class Solution {
    public int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {
        int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int start = Math.max(dayOfYear(arriveAlice, days), dayOfYear(arriveBob, days));
        int end = Math.min(dayOfYear(leaveAlice, days), dayOfYear(leaveBob, days));

        return Math.max(0, end - start + 1);
    }

    private int dayOfYear(String date, int[] days) {
        String[] parts = date.split("-");

        int month = Integer.parseInt(parts[0]);
        int day = Integer.parseInt(parts[1]);

        int total = day;

        for (int i=0; i<month - 1; i++) {
            total += days[i];
        }

        return total;
    }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna
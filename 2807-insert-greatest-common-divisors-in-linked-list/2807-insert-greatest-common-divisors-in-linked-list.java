/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        ListNode curr = head;
        while(curr!=null && curr.next!=null){
            int gcd = Gcd(curr.val, curr.next.val);
            ListNode temp = new ListNode(gcd);
            temp.next = curr.next;
            curr.next = temp;
            curr = temp.next;
        }
        return head;
    }
    private int Gcd(int a, int b){
        if(b==0) return a;
        return Gcd(b, a%b);
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna
/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode() : val(0), next(nullptr) {}
 *     ListNode(int x) : val(x), next(nullptr) {}
 *     ListNode(int x, ListNode *next) : val(x), next(next) {}
 * };
 */
class Solution {
public:
    ListNode* rotateRight(ListNode* head, int k) {
        if(!head || !head->next || k==0){
            return head;
        }
        int n=1;
        ListNode* tail = head;
        while(tail->next){
            tail = tail->next;
            n++;
        }
        k=k%n;
        if(k==0) return head;
        tail->next = head;
        ListNode* temp = head;
        for(int i=1; i<n-k; i++){
            temp = temp->next;
        }
        ListNode* newHead = temp->next;
        temp->next = nullptr;
        return newHead;
    }
};

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna
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
    ListNode* removeNthFromEnd(ListNode* head, int n) {
        ListNode* dummy=new ListNode(-1);
        dummy->next=head;
        ListNode* ptr=dummy;
        while(n>0){
            n--;
            ptr=ptr->next;
        }
        
        ListNode* tmp=dummy;
        while(ptr!=NULL&&ptr->next!=NULL){
            ptr=ptr->next;
            tmp=tmp->next;
        }

        if(tmp!=NULL&&tmp->next!=NULL)tmp->next=tmp->next->next;
        else return NULL;
        return dummy->next;
    }
};
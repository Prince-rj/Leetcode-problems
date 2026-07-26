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
        if(head==NULL)return NULL;
        int len=1;
        ListNode* ptr=head;
        while(ptr->next!=NULL){
            ptr=ptr->next;
            len++;
        }
        ptr->next=head;
        k=k%len;
        int val=len-k;
        ptr=head;
        
        while(val>1){
            val--;
            ptr=ptr->next;
        }
        ListNode* ans=ptr->next;
        ptr->next=NULL;
        return ans;
    }
};
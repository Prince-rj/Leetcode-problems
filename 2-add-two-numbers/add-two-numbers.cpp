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
    ListNode* addTwoNumbers(ListNode* l1, ListNode* l2) {
        ListNode* ptr1=l1;
        ListNode* ptr2=l2;
        ListNode* head=new ListNode(-1);
        ListNode* ptr=head;
        int carry=0;
        while(ptr1!=NULL && ptr2!=NULL){
            int val=carry+ptr1->val+ptr2->val;
            carry=val/10;
            val=val%10;
            ListNode* newNode=new ListNode(val);
            ptr->next=newNode;
            ptr=ptr->next;
            ptr1=ptr1->next;
            ptr2=ptr2->next;
        }
        while(ptr1!=NULL){
            int val=carry+ptr1->val;
            carry=val/10;
            val=val%10;
            ListNode* newNode=new ListNode(val);
            ptr->next=newNode;
            ptr=ptr->next;
            ptr1=ptr1->next;
        }
        while(ptr2!=NULL){
            int val=carry+ptr2->val;
            carry=val/10;
            val=val%10;
            ListNode* newNode=new ListNode(val);
            ptr->next=newNode;
            ptr=ptr->next;
            ptr2=ptr2->next;
        }
        if(carry!=0){
            ListNode* newNode=new ListNode(carry);
            ptr->next=newNode;
            ptr=ptr->next;
        }
        return head->next;
    }
};
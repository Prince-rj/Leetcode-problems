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
    ListNode* mergeTwoLists(ListNode* list1, ListNode* list2) {
        ListNode* dummy=new ListNode(-1,NULL);
        ListNode* newhead=dummy;
        ListNode *ptr1=list1;
        ListNode *ptr2=list2;
        while(ptr1!=NULL&&ptr2!=NULL){
            if(ptr1->val<=ptr2->val){
                dummy->next=ptr1;
                dummy=dummy->next;
                ptr1=ptr1->next;
            }
            else{
                dummy->next=ptr2;
                dummy=dummy->next;
                ptr2=ptr2->next;
            }
            // cout<<dummy->val;
        }
        while(ptr1!=NULL){
            dummy->next=ptr1;
            dummy=dummy->next;
            ptr1=ptr1->next;
        }
        while(ptr2!=NULL){
            dummy->next=ptr2;
            dummy=dummy->next;
            ptr2=ptr2->next;
        }
        return newhead->next;
    }
};
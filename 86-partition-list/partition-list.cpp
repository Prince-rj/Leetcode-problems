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
    ListNode* partition(ListNode* head, int x) {
        ListNode* dummy1=new ListNode(-1);
        ListNode* dummy2=new ListNode(-1);
        ListNode* ptr1=dummy1;
        ListNode* ptr2=dummy2;
        ListNode* ptr=head;
        while(ptr!=NULL){
            ListNode* next=ptr->next;
            if(ptr->val<x){
                ptr1->next=ptr;
                ptr1=ptr1->next;
                ptr1->next=NULL;
            }
            else{
                ptr2->next=ptr;
                ptr2=ptr2->next;
                ptr2->next=NULL;
            }
            cout<<ptr->val<<" "<<ptr1->val<<" ";
            ptr=next;
        }
        ptr1->next=dummy2->next;
        return dummy1->next;
    }
};
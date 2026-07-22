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
    ListNode* reverseBetween(ListNode* head, int left, int right) {
        if(left==right)return head;
        ListNode* ptr=head;
        ListNode*cnt=NULL;
        while(ptr!=NULL&&left>1){
            left--;
            cnt=ptr;
            ptr=ptr->next;
        }
        ListNode* ptr2=head;
        while(ptr2!=NULL&&right>1){
            right--;
            ptr2=ptr2->next;
        }
        if(cnt!=NULL)cnt->next=NULL;
        cout<<ptr->val<<" "<<ptr2->val;
        ListNode *r=ptr2->next;
        ptr2->next=NULL;
        ListNode* rever=rev(ptr);
        ListNode* tmp=rever;
        while(tmp->next!=NULL){
            tmp=tmp->next;
        }
        // cnt->next=rever;
        tmp->next=r;
        if(cnt!=NULL)cnt->next=rever;
        else head=rever;
        return head;
    }
    ListNode* rev(ListNode* head){
        ListNode* curr=head;
        ListNode* next=head->next;
        ListNode* prev=NULL;
        while(next!=NULL){
            curr->next=prev;
            prev=curr;
            curr=next;
            next=next->next;

        }
        curr->next=prev;

        // head->next=cont;
        ListNode* ptr=curr;
        while(ptr!=NULL){
            cout<<ptr->val<<" ";
            ptr=ptr->next;
        }
        return curr;

    }
};
/*
// Definition for a Node.
class Node {
public:
    int val;
    Node* next;
    Node* random;
    
    Node(int _val) {
        val = _val;
        next = NULL;
        random = NULL;
    }
};
*/

class Solution {
public:
    Node* copyRandomList(Node* head) {
        if(head==NULL)return NULL;
        Node* ptr=head;
        while(ptr!=NULL){
            Node* newNode=new Node(ptr->val);
            newNode->next=ptr->next;
            ptr->next=newNode;
            ptr=ptr->next->next;
        }
        ptr=head;
        Node* newptr=ptr->next;
        while(ptr!=NULL){
            if(ptr->random!=NULL)newptr->random=ptr->random->next;
            else newptr->random=NULL;
            ptr=ptr->next->next;
            if(newptr!=NULL&&newptr->next!=NULL)newptr=newptr->next->next;
        }
        ptr=head;
        Node* newhead=ptr->next;
        newptr=ptr->next;
        while(ptr!=NULL&&ptr->next!=NULL){
            Node* newtmpnext=ptr->next->next;
            if(newptr!=NULL&&newtmpnext!=NULL)newptr->next=newtmpnext->next;
            else if(newptr!=NULL) newptr->next=NULL;
            if(newptr!=NULL)ptr->next=newptr->next;
            else ptr->next=NULL;
            // if(newptr!=NULL)cout<<newptr->val<<" ";
            if(newptr!=NULL)newptr=newptr->next;
            ptr->next=newtmpnext;
            // if(ptr!=NULL)cout<<ptr->val<<" ";
            ptr=ptr->next;
        }        
        return newhead;
    }
};
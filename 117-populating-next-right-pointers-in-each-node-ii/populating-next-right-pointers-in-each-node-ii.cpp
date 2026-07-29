/*
// Definition for a Node.
class Node {
public:
    int val;
    Node* left;
    Node* right;
    Node* next;

    Node() : val(0), left(NULL), right(NULL), next(NULL) {}

    Node(int _val) : val(_val), left(NULL), right(NULL), next(NULL) {}

    Node(int _val, Node* _left, Node* _right, Node* _next)
        : val(_val), left(_left), right(_right), next(_next) {}
};
*/

class Solution {
public:
    Node* connect(Node* root) {
        if(root==NULL)return root;
        queue<Node*> q;
        q.push(root);
        while(!q.empty()){
            int n=q.size();
            vector<Node*> arr;
            for(int i=0;i<n;i++){
                Node* tmp=q.front();
                if(i!=0)arr[i-1]->next=tmp;
                arr.push_back(tmp);
                q.pop();
                if(tmp->left!=NULL)q.push(tmp->left);
                if(tmp->right!=NULL)q.push(tmp->right);
            }
            arr[n-1]->next=NULL;
        }
        return root;
    }
};
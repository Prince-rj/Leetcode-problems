/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode() : val(0), left(nullptr), right(nullptr) {}
 *     TreeNode(int x) : val(x), left(nullptr), right(nullptr) {}
 *     TreeNode(int x, TreeNode *left, TreeNode *right) : val(x), left(left), right(right) {}
 * };
 */
class Solution {
public:
    int sumNumbers(TreeNode* root) {
        vector<int> nos;
        long long v=0l;
        traverse(root,nos,v);
        int val=0;
        for(int i=0;i<nos.size();i++){
            val+=nos[i];
        }
        return val;
    }
    void traverse(TreeNode* root,vector<int>& nos,long long value ){
        if(root==NULL)return;
        if(root->left==NULL&&root->right==NULL){
            int dig=root->val;
            value=value*10+dig;
            nos.push_back(value);
        }
        int dig=root->val;
        value=value*10+dig;
        traverse(root->left,nos,value);
        traverse(root->right,nos,value);
    }
};
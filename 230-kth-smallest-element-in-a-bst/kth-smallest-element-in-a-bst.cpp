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
    int kthSmallest(TreeNode* root, int k) {
        vector<int> lis;
        inorder(root,lis);
        return lis[k-1];
    }
    void inorder(TreeNode* root,vector<int>& lis){
        if(root==NULL)return;
        inorder(root->left,lis);
        lis.push_back(root->val);
        inorder(root->right,lis);
    }
};
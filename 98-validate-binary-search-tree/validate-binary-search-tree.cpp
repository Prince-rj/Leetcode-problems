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
    bool isValidBST(TreeNode* root) {
        long prev=1e11-1;
        return help(root,prev);

    }
    bool help(TreeNode* root,long& prev){
        if(root==NULL)return true;
        bool l=help(root->left,prev);
        if(prev!=(1e11-1)&&prev>=root->val)return false;
        prev=root->val;
        bool r=help(root->right,prev);
        return l&&r;
    }
};
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
    int countNodes(TreeNode* root) {
        int dl=left_depth(root);
        int dr=right_depth(root);
        int ans=0;
        if(dl==dr)return pow(2,dl)-1;
        else return countNodes(root->left)+countNodes(root->right)+1;
    }
    int left_depth(TreeNode* root){
        if(root==NULL)return 0;
        return 1+left_depth(root->left);
    }
    int right_depth(TreeNode* root){
        if(root==NULL)return 0;
        return 1+right_depth(root->right);
    }
};
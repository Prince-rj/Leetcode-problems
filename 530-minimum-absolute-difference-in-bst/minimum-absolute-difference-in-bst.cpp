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
    int getMinimumDifference(TreeNode* root) {
        int ans=1e9;
        int prev=1e9;
        help(root,ans,prev);
        return ans;
    }
    void help(TreeNode* root,int& ans,int& prev){
        if(root==NULL)return;
        help(root->left,ans,prev);
        ans=min(ans,abs(root->val-prev));
        cout<<prev<<" "<<root->val<<endl;
        prev=root->val;
        help(root->right,ans,prev);

    }
};
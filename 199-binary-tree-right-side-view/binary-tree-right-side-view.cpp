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
    vector<int> rightSideView(TreeNode* root) {
        queue<TreeNode*> q;
        q.push(root);
        vector<int> ans;
        if(root==NULL)return ans;
        while(!q.empty()){
            int n=q.size();
            int v=0;
            for(int i=0;i<n;i++){
                TreeNode* tmp=q.front();
                q.pop();
                v=tmp->val;
                if(tmp->left!=NULL)q.push(tmp->left);
                if(tmp->right!=NULL)q.push(tmp->right);
            }
            ans.push_back(v);
        } 
        return ans;
    }
};
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
    vector<vector<int>> zigzagLevelOrder(TreeNode* root) {
        queue<TreeNode*> q;
        vector<vector<int>> lis;
        if(root==NULL)return lis;
        q.push(root);
        bool flag=false;
        while(!q.empty()){
            int n=q.size();
            flag= !flag;
            vector<int> tmplis;
            for(int i=0;i<n;i++){
                TreeNode* tmp=q.front();
                q.pop();
                if(tmp->left!=NULL)q.push(tmp->left);
                if(tmp->right!=NULL)q.push(tmp->right);
                if(flag) tmplis.push_back(tmp->val);
                else tmplis.insert(tmplis.begin(),tmp->val);
            }
            lis.push_back(tmplis);
        }
        return lis;
    }
};
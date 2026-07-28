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
    int i=0;
    TreeNode* buildTree(vector<int>& inorder, vector<int>& postorder) {
        i=postorder.size()-1;
        return build(inorder,postorder,0,postorder.size()-1);
    }
    TreeNode* build(vector<int>& inorder, vector<int>& postorder, int l,int r){
        if(l>r)return NULL;
        TreeNode* newNode=new TreeNode(postorder[i]);
        int ind=search(inorder,postorder[i--]);
        newNode->right=build(inorder,postorder,ind+1,r);
        newNode->left=build(inorder,postorder,l,ind-1);
        return newNode;
    }
    int search(vector<int>& inorder,int n){
        for(int i=0;i<inorder.size();i++){
            if(inorder[i]==n)return i;
        }
        return -1;
    }

};
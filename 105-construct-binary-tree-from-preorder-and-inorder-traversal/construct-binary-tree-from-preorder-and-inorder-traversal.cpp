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
    TreeNode* buildTree(vector<int>& preorder, vector<int>& inorder) {
        return build(preorder,inorder,0,preorder.size()-1);
    }
    TreeNode* build(vector<int>& preorder, vector<int>& inorder,int l,int r){
        if(l>r)return NULL;
        TreeNode* newNode=new TreeNode(preorder[i]);
        int ind=search(inorder,preorder[i++]);
        newNode->left=build(preorder,inorder,l,ind-1);
        newNode->right=build(preorder,inorder,ind+1,r);
        return newNode;
    }
    int search(vector<int>& arr,int n){
        for(int i=0;i<arr.size();i++){
            if(arr[i]==n)return i;
        }
        return -1;
    }
};
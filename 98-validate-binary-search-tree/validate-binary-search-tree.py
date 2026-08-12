# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def isValidBST(self, root: Optional[TreeNode]) -> bool:
        prev=1e11-1
        def help(root) -> bool:
            nonlocal prev
            if not root: return True
            l=help(root.left)
            if prev!=1e11-1 and prev >= root.val: return False
            prev=root.val
            r=help(root.right)
            return l and r
        return help(root)
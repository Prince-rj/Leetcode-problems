# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def sortedArrayToBST(self, nums: List[int]) -> Optional[TreeNode]:
        def help(i,j):
            if i>j: return
            mid=i+(j-i)//2
            node=TreeNode(nums[mid])
            node.left=help(i,mid-1)
            node.right=help(mid+1,j)
            return node
        return help(0,len(nums)-1)
        
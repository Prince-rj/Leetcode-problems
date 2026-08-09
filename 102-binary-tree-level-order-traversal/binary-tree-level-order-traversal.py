# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def levelOrder(self, root: Optional[TreeNode]) -> List[List[int]]:
        q = deque()
        q.append(root)
        trav = list()
        if root is None: return trav
        while q:
            n=len(q)
            lis=list()
            for i in range(n):
                tmp=q.popleft()
                lis.append(tmp.val)
                if tmp.left is not None: q.append(tmp.left)
                if tmp.right is not None : q.append(tmp.right)
            trav.append(lis)
        return trav
                
        
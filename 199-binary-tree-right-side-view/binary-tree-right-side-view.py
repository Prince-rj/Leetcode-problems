# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def rightSideView(self, root: Optional[TreeNode]) -> List[int]:
        q=deque()
        q.append(root)
        ans=list()
        if root is None: return ans
        while q:
            n=len(q)
            v=-1
            for i in range(n):
                tmp=q.popleft()
                v=tmp.val
                if tmp.left: q.append(tmp.left)
                if tmp.right: q.append(tmp.right)
            ans.append(v)
        return ans
        
# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def zigzagLevelOrder(self, root: Optional[TreeNode]) -> List[List[int]]:
        lis= list()
        if not root: return lis
        q=deque()
        q.append(root)
        flag=False
        while q:
            n=len(q)
            flag=not flag
            tmplis = list()
            for i in range(n):
                temp=q.popleft()
                if temp.left: q.append(temp.left)
                if temp.right: q.append(temp.right)
                if flag:
                    tmplis.append(temp.val)
                else: tmplis.insert(0,temp.val)
            lis.append(tmplis)
        return lis



        
"""
# Definition for a Node.
class Node:
    def __init__(self, val: int = 0, left: 'Node' = None, right: 'Node' = None, next: 'Node' = None):
        self.val = val
        self.left = left
        self.right = right
        self.next = next
"""

class Solution:
    def connect(self, root: 'Node') -> 'Node':
        if root==None: return None
        q=deque()
        q.append(root)
        while q:
            l=list()
            n=len(q)
            for i in range(n):
                tmp=q[0]
                q.popleft()   
                if tmp.left!=None: q.append(tmp.left)
                if tmp.right!=None: q.append(tmp.right)
                if i!=0: l[i-1].next=tmp
                l.append(tmp)
            l[n-1].next=None
        return root     
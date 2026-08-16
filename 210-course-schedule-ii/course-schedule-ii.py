class Solution:
    def findOrder(self, numCourses: int, prerequisites: List[List[int]]) -> List[int]:
        def cycle(adj,i,vis,path,st):
            vis.add(i)
            if i not in adj: 
                st.append(i)
                return False
            path.add(i)
            val=False
            for x in adj[i]:
                if x in path: return True
                if x not in vis:
                    val= val or cycle(adj,x,vis,path,st)
            path.remove(i)
            st.append(i)
            return val
        adj=dict()
        for i in prerequisites:
            if i[1] not in adj: adj[i[1]]=list()
            adj[i[1]].append(i[0])
        vis =set()
        path=set()
        st=deque()
        val=True
        for i in range(numCourses):
            if i not in vis:
                val= val and not cycle(adj,i,vis,path,st)
        ans=list()
        if not val: return ans
        while st:
            v=st.pop()
            ans.append(v)
        return ans



class Solution:
    def calcEquation(self, equations: List[List[str]], values: List[float], queries: List[List[str]]) -> List[float]:
        # {a,b,c,d} -> edges => {a-b} {b-c} {a-c} values =>{} adj = {a =>{{b,}}}
        def dfs(adj,x,end,vis):
            if x==end: return 1
            vis.add(x)
            if x not in adj: return -1
            for i in adj[x]:
                if i[0] not in vis:
                    y= dfs(adj,i[0],end,vis)
                    if y!=-1: return y*i[1]
            return -1
        adj = dict()
        ans=list()
        for i in range(len(equations)):
            x=equations[i]
            if x[0] not in adj: adj[x[0]]=list()
            adj[x[0]].append([x[1],values[i]])
            if x[1] not in adj: adj[x[1]]=list()
            adj[x[1]].append([x[0],1/values[i]])
        for i in queries:
            vis=set()
            if i[0] not in adj: v=-1
            else: v=dfs(adj,i[0],i[1],vis)
            ans.append(v)
        return ans
            
            
        
            


        
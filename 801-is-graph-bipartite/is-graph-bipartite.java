class Solution {
    public boolean isBipartite(int[][] graph) {
        boolean ans=true;
        int vis[]=new int[graph.length];
        for(int i=0;i<graph.length;i++){
            if(vis[i]==0){
                ans&=help(graph,i,1,-1,vis);
            }
        }
        return ans;
    }
    public boolean help(int[][] graph,int i,int col,int par,int []vis){
        if(vis[i]!=0){
            return !(vis[par]==vis[i]);
        }
        vis[i]=col;
        boolean ans=true;
        for(int x:graph[i]){
            int c=(col==1)?2:1;
            ans&=help(graph,x,c,i,vis);
        }
        return ans;
    }
}
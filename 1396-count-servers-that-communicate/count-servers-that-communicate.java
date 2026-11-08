class Solution {
    public int countServers(int[][] grid) {
        HashSet<String> hs=new HashSet<>();
        for(int i=0;i<grid.length;i++){
            boolean isPres=false;
            String first="";
            for(int j=0;j<grid[0].length;j++){
                if(isPres&&grid[i][j]==1){
                    String s=Integer.toString(i)+" "+Integer.toString(j);
                    hs.add(s);
                    hs.add(first);
                }
                if(isPres!=true&&grid[i][j]==1){
                    isPres=true;
                    first=Integer.toString(i)+" "+Integer.toString(j);
                }
            }
            
        }
        for(int i=0;i<grid[0].length;i++){
            boolean isPres=false;
            String first="";
            for(int j=0;j<grid.length;j++){
                if(isPres&&grid[j][i]==1){
                    String s=Integer.toString(j)+" "+Integer.toString(i);
                    hs.add(s);
                    hs.add(first);
                }
                if(isPres!=true&&grid[j][i]==1){
                    isPres=true;
                    first=Integer.toString(j)+" "+Integer.toString(i);
                }
            }
            
        }
        // System.out.println(hs);
        return hs.size();
    }
}
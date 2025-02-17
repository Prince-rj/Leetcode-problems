class Solution {
    public int numTilePossibilities(String tiles) {
        HashSet<String> hs=new HashSet<>();
        int[] taken=new int[tiles.length()];
        help(taken,0,tiles,new StringBuilder(),hs);
        return hs.size();
    }
    public void help(int[] taken,int i,String tiles,StringBuilder sb,HashSet<String> hs){
        if(sb.length()>0){
            String temp=sb.toString();
            hs.add(temp);
            // System.out.println(hs);
        }
        //pick
        for(int j=0;j<tiles.length();j++){
            if(taken[j]==1)continue;
            sb.append(tiles.charAt(j));
            taken[j]=1;
            // System.out.println(sb);
            help(taken,i+1,tiles,sb,hs);
            sb.setLength(sb.length()-1);
            taken[j]=0;
                // help(taken,i+1,tiles,sb,hs);
        }
        // help(i+1,tiles,sb,hs);
        
    }
}
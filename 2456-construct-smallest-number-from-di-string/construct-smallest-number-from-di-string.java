class Solution {
    public String smallestNumber(String pattern) {
        List<String> li=new ArrayList<>();
        help(new boolean[10],pattern,-1,-1,new StringBuilder(),li);
        return li.get(0);
    }
    public void help(boolean used[],String pattern,int ind,int prev,StringBuilder num,List<String> fin){
        if(ind==pattern.length()){
            // System.out.println(num);
            fin.add(num.toString());
            return;
        }
        for(int i=1;i<=9;i++){
            if(prev!=-1&&pattern.charAt(ind)=='I'){
                if(i<=prev)continue;
            }
            else{
                if(prev!=-1&&i>=prev)continue;
            }
            if(used[i]==true)continue;
            num.append(i);
            used[i]=true;
            help(used,pattern,ind+1,i,num,fin);
            used[i]=false;
            num.setLength(num.length()-1);
        }
    }
}
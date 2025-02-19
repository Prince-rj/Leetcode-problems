class Solution {
    public String getHappyString(int n, int k) {
        ArrayList<String> ar=new ArrayList<>();
        help(0,'*',n,ar,new StringBuilder());
        return (k>ar.size())?"":ar.get(k-1);
    }
    public void help(int i,char prev,int n,ArrayList<String> ar,StringBuilder sb){
        if(i==n){
            ar.add(sb.toString());
            return;
        }
        //pick a
        if(prev!='a'){
            sb.append('a');
            help(i+1,'a',n,ar,sb);
            sb.setLength(sb.length()-1);
        }
        //pick b
        if(prev!='b'){
            sb.append('b');
            help(i+1,'b',n,ar,sb);
            sb.setLength(sb.length()-1);
        }
        //pick c
        if(prev!='c'){
            sb.append('c');
            help(i+1,'c',n,ar,sb);
            sb.setLength(sb.length()-1);
        }
    }
}
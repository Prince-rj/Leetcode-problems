class Solution {
    class t{
        String s;
        int v;
        t(String s,int v){
            this.s=s;
            this.v=v;
        }
    }
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        // HashMap<String,ArrayList<String>> adj=new HashMap<>();
        HashMap<String,Integer> hs=new HashMap<>();
        hs.put(beginWord,0);
        for(var i:wordList)hs.put(i,0);
        Queue<t> q=new LinkedList<>();
        q.add(new t(beginWord,1));
        while(!q.isEmpty()){
            t tm=q.poll();
            char[] s=tm.s.toCharArray();
            hs.put(tm.s,1);
            // System.out.println(tm.s);
            int v=tm.v;
            if(tm.s.equals(endWord))return v;
            for(int i=0;i<s.length;i++){
                char c=s[i];
                for(int j=0;j<26;j++){
                    s[i]=(char)('a'+j);
                    String x=new String(s);
                    // System.out.println(x);
                    if(hs.containsKey(x)&&hs.get(x)==0){
                        q.add(new t(x,v+1));
                    }
                }
                s[i]=c;
            }
        }
        return 0;
    }
}
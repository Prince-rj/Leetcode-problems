class Solution {
    public int punishmentNumber(int n) {
        int val=0;
        for(int i=1;i<=n;i++){
            if(help(0,Integer.toString(i*i),i,0)){
                // System.out.println(i*i);
                val+=i*i;
            }
        }
        return val;
    }
    public boolean help(int i,String s,int x,int sum){
        if(i>=s.length()){
            if(sum==x)return true;
            return false;
        }
        boolean ans=false;
        for(int j=i+1;j<=s.length();j++){
            int val=valueof(s,i,j);
            // System.out.println(s+" "+val);
            ans|=help(j,s,x,sum+val);
        }
        return ans;
        
    }
    public int valueof(String s,int l,int r){
        int val=0;
        for(int i=l;i<r;i++){
            int dig=s.charAt(i)-'0';
            val=val*10+dig;
        }
        return val;
    }
}
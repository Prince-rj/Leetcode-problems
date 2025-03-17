class Solution {
    public int candy(int[] ratings) {
        int r[]=new int[ratings.length];
        r[0]=1;
        for(int i=1;i<ratings.length;i++){
            if(ratings[i-1]<ratings[i])r[i]=r[i-1]+1;
            else r[i]=1;
        }
        int s[]=new int[ratings.length];
        s[ratings.length-1]=1;
        for(int i=ratings.length-2;i>=0;i--){
            if(ratings[i+1]<ratings[i])s[i]=s[i+1]+1;
            else s[i]=1;
        }
        int ans=0;
        for(var i=0;i<ratings.length;i++){
            ans+=Math.max(s[i],r[i]);
        }
        return ans;
    }
}
class Solution {
    public int candy(int[] ratings) {
        int r[]=new int[ratings.length];
        r[0]=1;
        for(int i=1;i<ratings.length;i++){
            if(ratings[i-1]<ratings[i])r[i]=r[i-1]+1;
            else r[i]=1;
        }
        int ans=0;
        int v=1;
        for(int i=ratings.length-2;i>=0;i--){
            if(ratings[i+1]<ratings[i]){
                v=v+1;
                ans+=Math.max(v,r[i]);
            }
            else{
                v=1;
                ans+=Math.max(v,r[i]);
            } 
        }
        ans+=Math.max(1,r[ratings.length-1]);
        return ans;
    }
}
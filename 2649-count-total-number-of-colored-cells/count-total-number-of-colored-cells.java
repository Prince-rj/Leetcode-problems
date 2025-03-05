class Solution {
    public long coloredCells(int n) {
        // 1,4,8,16
        // return 
        long ans=1;
        long v=4;
        for(int i=0;i<n-1;i++){
            ans+=v;
            v+=4;
        }
        return ans;
    }
}
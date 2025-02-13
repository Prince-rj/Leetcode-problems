class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> hs=new HashSet<>();
        for(var i:nums)hs.add(i);
        int i=0;
        int ans=0;
        for(var val:hs){
            if(!hs.contains(val+1)){
                int cnt=0;
                while(hs.contains(val--)){
                    cnt++;
                }
                ans=Math.max(ans,cnt);
            }
        }
        return ans;
    }
}
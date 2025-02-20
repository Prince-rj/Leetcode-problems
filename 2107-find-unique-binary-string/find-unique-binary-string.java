class Solution {
    public String findDifferentBinaryString(String[] nums) {
        HashSet<String> hs=new HashSet<>();
        for(var i:nums){
            hs.add(i);
        }
        help(0,nums[0].length(),new StringBuilder(),hs);
        for(var i:nums)hs.remove(i);
        for(var i:hs)return i;
        return null;

    }
    public void help(int i,int n,StringBuilder sb,HashSet<String> hs){
        if(i==n){
            hs.add(sb.toString());
            return;
        }
        //pick 0
        sb.append('0');
        help(i+1,n,sb,hs);
        sb.setLength(sb.length()-1);
        //pick 1
        sb.append('1');
        help(i+1,n,sb,hs);
        sb.setLength(sb.length()-1);
    }
}
class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int j=0;
        int cnt=0;
        for(int i=0;i<g.length;i++){
            while(j<s.length&&s[j]<g[i])j++;
            if(j==s.length)break;
            if(s[j]>=g[i]){
                cnt++;
                j++;
            }
        }
        return cnt;
    }
}
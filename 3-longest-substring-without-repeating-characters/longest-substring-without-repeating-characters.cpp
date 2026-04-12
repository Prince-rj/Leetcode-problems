class Solution {
public:
    int lengthOfLongestSubstring(string s) {
        unordered_map<char,int> mp;
        int i=0;
        int j=0;
        int ans=INT_MIN;
        while(i<s.size()){
            char c=s[i];
            if(mp.count(c)==0||mp[c]<j){
                mp[c]=i;
                ans=max(ans,i-j+1);
                i++;
            }
            else{
                j=mp[c]+1;
            }
        }
        return ans==INT_MIN?0:ans;
    }
};
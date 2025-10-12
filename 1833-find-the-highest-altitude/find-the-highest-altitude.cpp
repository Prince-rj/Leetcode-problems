class Solution {
public:
    int largestAltitude(vector<int>& gain) {
        int v=0,ans=0;
        for(auto i:gain){
            v+=i;
            ans=max(ans,v);
        }
        return ans;
    }
};
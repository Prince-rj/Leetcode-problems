class Solution {
public:
    vector<vector<string>> groupAnagrams(vector<string>& strs) {
        unordered_map<string,vector<string>> mp;
        for(int i=0;i<strs.size();i++){
            string val=strs[i];
            sort(val.begin(),val.end());
            if(mp.count(val)==0){
                mp[val].push_back(strs[i]);
            }
            else{
                mp[val].push_back(strs[i]);
            }
        }
        vector<vector<string>> ans;
        for(auto &i:mp){
            ans.push_back(i.second);
        }
        return ans;
    }
};
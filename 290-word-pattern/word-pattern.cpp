class Solution {
public:
    bool wordPattern(string pattern, string s) {
        unordered_map<char,string> mp;
        unordered_map<string,char> mp2;
        vector<string> arr;
        string str;
        stringstream ss(s);
        while(ss >> str){
            arr.push_back(str);
        }
        if(arr.size()!=pattern.length())return false;
        
        for(int i=0;i<pattern.length();i++){
            if(mp.count(pattern[i])==0&&mp2.count(arr[i])==0){
                mp[pattern[i]]=arr[i];
                mp2[arr[i]]=pattern[i];
            }
            else{
                // cout<<mp[pattern[i]];
                if(mp2[arr[i]]!=pattern[i])return false;
                if(arr[i]!=mp[pattern[i]])return false;
            }
        }
        return true;

    }
};
class Solution {
public:
    string longestCommonPrefix(vector<string>& strs) {
        string ans="";
        for(int i=0;i<strs[0].length();i++){
            char c=strs[0][i];
            bool ispref=true;
            for(int j=1;j<strs.size();j++){
                if(strs[j].length()<=i)return ans;
                if(strs[j][i]==c)ispref=true;
                else return ans;
            }
            if(ispref)ans+=c;
            else return ans;
        }
        return ans;        
    }
};
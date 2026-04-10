class Solution {
public:
    bool isSubsequence(string s, string t) {
        int i=0;
        int j=0;
        while(i<t.length()){
            if(j==s.length())return true;
            if(s[j]==t[i]){
                i++;
                j++;
            }
            else i++;
        }
        if(j==s.length())return true;
        return false;
    }
};
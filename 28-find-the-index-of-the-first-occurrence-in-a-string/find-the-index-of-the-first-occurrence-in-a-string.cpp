class Solution {
public:
    int strStr(string haystack, string needle) {
        int i=0;//haystack
        while(i<haystack.length()){
            if(needle[0]==haystack[i]){
                int ind=i;
                int j=0;
                while(j<needle.length()&&ind<haystack.length()&&haystack[ind]==needle[j]){
                    ind++;
                    j++;
                }
                if(j==needle.length())return i;
            }
            i++;
        }
        return -1;
    }
};
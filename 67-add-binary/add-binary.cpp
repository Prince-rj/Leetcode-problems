class Solution {
public:
    string addBinary(string a, string b) {
        string ans="";
        int i=a.length()-1;
        int j=b.length()-1;
        int carry=0;
        while(i>=0&&j>=0){
            int val=(a[i]-'0')+(b[j]-'0')+carry;
            if(val>=2){
                carry=1;
                val=val%2;
            }
            else carry=0;
            ans=to_string(val)+ans;
            i--;
            j--;
        }
        while(i>=0){
            int val=(a[i]-'0')+carry;
            if(val>=2){
                carry=1;
                val=val%2;
            }else{
                carry=0;
            }
            ans=to_string(val)+ans;
            i--;
        }
        while(j>=0){
            int val=(b[j]-'0')+carry;
            if(val>=2){
                carry=1;
                val=val%2;
            }else{
                carry=0;
            }
            ans=to_string(val)+ans;
            j--;
        }
        if(carry==1)ans="1"+ans;
        return ans;
    }
};
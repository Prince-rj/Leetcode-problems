class Solution {
public:
    int reverseBits(int n) {
        int val=0;
        for(int i=0;i<32;i++){
            int bit=(n>>i)&1;
            int valbit=31-i;
            // cout<<i<<" "<<bit<<" "<<valbit<<" "<<endl;
            val|=(bit<<valbit);
        }
        return val;
    }
};
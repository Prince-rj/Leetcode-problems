class Solution {
public:
    int hammingWeight(int n) {
        int x=0;
        for(int i=0;i<32;i++){
            int bit=n>>i&1;;
            if(bit==1)x++;
        }
        return x;
    }
};
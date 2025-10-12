class Solution {
public:
    int minFlips(int a, int b, int c) {
        int cnt=0;
        for(int i=0;i<32;i++){
            int bit1=a>>i&1;
            int bit2=b>>i&1;
            int bit3=c>>i&1;
            int c=0;
            if((bit1|bit2)!=bit3){
                if((bit1==1&&bit2==1)&&bit3==0)cnt+=2;
                else cnt++;
            }
        }
        return cnt;
    }
};
class Solution {
    public boolean lemonadeChange(int[] bills) {
        int five=0;
        int ten=0;
        int twenty=0;
        for(var i:bills){
            if(i==5)five++;
            if(i==10){
                if(five<=0)return false;
                five--;
                ten++;
            }
            if(i==20){
                if(ten>=1){
                    ten--;
                    if(five<1)return false;
                    five--;
                    twenty++;
                }
                else{
                    if(five<3)return false;
                    five-=3;
                    twenty++;
                }
                
            }
        }
        return true;
    }
}
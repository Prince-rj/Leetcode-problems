class Solution {
public:
    bool isHappy(int n) {
        unordered_set<int> hs;
        int val=sumOfSquare(n);
        while(!hs.contains(val)){
            hs.insert(val);
            val=sumOfSquare(val);
        }
        if(hs.contains(1))return true;
        return false;
    }
    int sumOfSquare(int n){
        int val=0;
        while(n>0){
            int dig=n%10;
            val+=dig*dig;
            n=n/10;
        }
        return val;
    }
};
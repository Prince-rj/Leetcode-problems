class Solution {
    public boolean checkPowersOfThree(int n) {
        // StringBuilder sb=new stringBuilder();
        while(n>0){
            int v=n%3;
            if(v==2)return false;
            n=n/3;
        }
        return true;
    }
}
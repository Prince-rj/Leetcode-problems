class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int[] arr=new int[cardPoints.length];
        int n=arr.length;
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=cardPoints[i];
            arr[i]=sum;
        }
        if(n==k)return arr[k-1];
        int ans=arr[n-k-1];
        for(int i=(n-k);i<arr.length;i++){
            ans=Math.min(ans,arr[i]-arr[i-(n-k)]);
        }
        return arr[arr.length-1]-ans;
    }
}
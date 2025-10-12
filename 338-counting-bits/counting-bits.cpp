class Solution {
public:
    vector<int> countBits(int n) {
        vector<int> v(n+1,0);
        for(int j=0;j<=n;j++){
            int c=0;
            for(int i=0;i<32;i++){
                int bit=j>>i&1;
                // cout<<bit<<" ";
                if(bit==1)c++;
            }
            // cout<<endl;
            v[j]=c;
        }
        return v;
    }
};
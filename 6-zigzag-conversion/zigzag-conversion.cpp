class Solution {
public:
    string convert(string s, int numRows) {
        //(numrows+numrows-2) 4
        // 0->0
        // 1->1
        // 2->2
        // 3->1 -> 3
        // 4->0 -> 2(4)
        // 5->1 -> 1(5)
        // 6->2
        // 7->1
        // 8->0

        if(numRows==1)return s;
        string arr[numRows];
        for(int i=0;i<s.length();i++){
            int c=s[i];
            int ind=(i%(numRows+numRows-2));
            if(ind>=numRows){
                ind=(numRows+numRows-2)-ind;
            }
            arr[ind]+=c;
        }
        string ans="";
        for(int i=0;i<numRows;i++){
            // cout<<arr[i]<<endl;
            ans+=arr[i];
        }
        return ans;
       
    }
};
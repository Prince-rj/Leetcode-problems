class Solution {
public:
    bool isValid(string s) {
        stack<char> st;
        for(int i=0;i<s.length();i++){
            if(st.size()>0&&s[i]==')'&&st.top()=='(')st.pop();
            else if(st.size()>0&&s[i]=='}'&&st.top()=='{')st.pop();
            else if(st.size()>0&&s[i]==']'&&st.top()=='[')st.pop();
            else st.push(s[i]);
        }
        // while(st.size()>0){
        //     cout<<st.top()<<" ";
        //     st.pop();
        // }
        return st.size()==0;
    }
};
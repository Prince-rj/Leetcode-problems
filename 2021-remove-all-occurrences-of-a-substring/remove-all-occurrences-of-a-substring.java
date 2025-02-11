class Solution {
    public String removeOccurrences(String s, String part) {
        Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            st.push(c);
            if(st.peek()==part.charAt(part.length()-1)&&check(part,st)){
                for(int j=0;j<part.length();j++){
                    st.pop();
                }
            }
        }
        StringBuilder sb=new StringBuilder();
        while(!st.isEmpty()){
            sb.insert(0,st.pop());
        }
        return sb.toString();
    }
    public boolean check(String part,Stack<Character> st){
        Stack<Character> t=new Stack<>();
        t.addAll(st);
        for(int j=part.length()-1;j>=0;j--){
            if(t.isEmpty()||t.peek()!=part.charAt(j))return false;
            t.pop();
        }
        return true;
    }
}
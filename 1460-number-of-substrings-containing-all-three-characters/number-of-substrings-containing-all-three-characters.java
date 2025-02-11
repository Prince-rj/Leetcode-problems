class Solution {
    public int numberOfSubstrings(String s) {
        int a[]=new int[s.length()];
        int b[]=new int[s.length()];
        int c[]=new int[s.length()];
        if(s.charAt(s.length()-1)=='a'){
            a[s.length()-1]=s.length()-1;
            b[s.length()-1]=s.length();
            c[s.length()-1]=s.length();
        }
        if(s.charAt(s.length()-1)=='b'){
            a[s.length()-1]=s.length();
            b[s.length()-1]=s.length()-1;
            c[s.length()-1]=s.length();
        }
        if(s.charAt(s.length()-1)=='c'){
            a[s.length()-1]=s.length();
            b[s.length()-1]=s.length();
            c[s.length()-1]=s.length()-1;
        }
        for(int i=s.length()-2;i>=0;i--){
            char x=s.charAt(i);
            if(x=='a'){
                a[i]=i;
                b[i]=b[i+1];
                c[i]=c[i+1];
            }
            if(x=='b'){
                b[i]=i;
                c[i]=c[i+1];
                a[i]=a[i+1];
            }
            if(x=='c'){
                c[i]=i;
                b[i]=b[i+1];
                a[i]=a[i+1];
            }
        }
        int ans=0;
        for(int i=0;i<s.length();i++){
            int v=Math.max(a[i],Math.max(b[i],c[i]));
            ans+=s.length()-v;
        }
        return ans;

    }
}
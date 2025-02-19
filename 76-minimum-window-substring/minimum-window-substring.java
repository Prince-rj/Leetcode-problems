class Solution {
    public String minWindow(String s, String t) {
        int ch[]=new int[256];
        for(var i:t.toCharArray()){
            ch[i]++;
        }
        int[] arr=new int[256];
        int i=0;
        int j=0;
        int len=Integer.MAX_VALUE;
        StringBuilder ans=new StringBuilder();
        while(i<s.length()){
            if(check(ch,arr)){
                if(len>(i-j+1)){
                    len=i-j+1;
                    ans=new StringBuilder(s.substring(j,i));
                }
                // System.out.println(s.substring(j,i)+" "+i+" "+j);
                arr[s.charAt(j)]--;
                j++;
            }
            else{
                arr[s.charAt(i)]++;
                i++;
            }
        }
        while(check(ch,arr)){
            if(len>(i-j)){
                len=i-j;
                ans=new StringBuilder(s.substring(j,i));
            }
            // System.out.println(s.substring(j,i)+" "+i+" "+j);
            arr[s.charAt(j)]--;
            j++;
        }
        return ans.toString();

    }
    public boolean check(int[] ch,int arr[]){
        for(int i=0;i<256;i++){
            if(arr[i]<ch[i])return false;
        }
        return true;
    }
}
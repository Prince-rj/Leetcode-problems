class Solution {
public:
    vector<string> fullJustify(vector<string>& words, int maxWidth) {
        int i=0;
        int curr_len=0;
        int word_cnt=0;
        vector<string> ans;
        while(i<words.size()){
            int len=words[i].length();
            curr_len+=len;
            if(curr_len+word_cnt>maxWidth){
                string tmp="";
                int j=i-1;
                int go_to=word_cnt;
                int rem=maxWidth-(curr_len-len);
                word_cnt-=1;
                for(int x=0;x<go_to;x++){
                    tmp=words[j]+tmp;
                    // cout<<rem<<" "<<endl;
                    if(go_to==1){
                        for(int x=0;x<rem;x++){
                            tmp+=" ";
                        }
                    }
                    if(word_cnt>0){
                        int spaces=rem/(word_cnt--);
                        for(int a=0;a<spaces;a++)tmp=" "+tmp;
                        rem=rem-spaces;
                    }
                    j--;
                }
                ans.push_back(tmp);
                curr_len=len;
                word_cnt=0;
            }
            word_cnt++;
            i++;
        }
        int j=i-1;
        string tmp="";
        for(int x=0;x<word_cnt;x++){
            tmp=words[j]+tmp;
            if(x!=word_cnt-1)tmp=" "+tmp;
            j--;
        }
        for(int x=tmp.length();x<maxWidth;x++){
            tmp+=" ";
        }
        ans.push_back(tmp);
        return ans;
    }
};
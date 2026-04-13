class Solution {
public:
    bool isValidSudoku(vector<vector<char>>& board) {
        for(int i=0;i<board.size();i++){
            if(!isValidCol(board,i))return false;
            // cout<<"Valid_col"<<endl;
            if(!isValidRow(board,i))return false;
            // cout<<"Valid_row"<<endl;
        }
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if(!isValidbox(board,i*3,j*3))return false;
                // cout<<"Valid_box"<<endl;
            }
        }
        return true;
    }
    bool isValidCol(vector<vector<char>>& board,int c){
        unordered_set<char> us;
        for(int i=0;i<board.size();i++){
            // cout<<board[i][c]<<" ";
            if(board[i][c]!='.'&&us.count(board[i][c])!=0)return false;
            us.insert(board[i][c]);
        }
        return true;
    }
    bool isValidRow(vector<vector<char>>& board,int r){
        unordered_set<char> us;
        for(int i=0;i<board[0].size();i++){
            if(board[r][i]!='.'&&us.count(board[r][i])!=0)return false;
            us.insert(board[r][i]);
        }
        return true;
    }
    bool isValidbox(vector<vector<char>>& board,int start_r,int start_c){
        
        unordered_set<char> us;
        for(int i=start_r;i<start_r+3;i++){
            for(int j=start_c;j<start_c+3;j++){
                if(board[i][j]!='.'&&us.count(board[i][j])!=0)return false;
                us.insert(board[i][j]);
            }
        }
        return true;
    }
};
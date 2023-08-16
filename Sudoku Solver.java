class Solution {
    int col[][]=new int[9][9];
    int row[][]=new int[9][9];
    int mat[][]=new int[9][9];
    boolean ans=false;
    public void solveSudoku(char[][] board) {
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(board[i][j]!='.'){
                    int val=(int)(board[i][j]-'0');
                    col[j][val-1]=1;
                    row[i][val-1]=1;
                }
            }
        }
        for(int i=0;i<board.length;i+=3){
            for(int j=0;j<board[0].length;j+=3){
                for(int i1=i;i1<i+3;i1++){
                    for(int j1=j;j1<j+3;j1++){
                        if(board[i1][j1]!='.'){
                            int val=(int)(board[i1][j1]-'0');
                            mat[i+j/3][val-1]=1;
                        }
                    }
                }
            }
        }
        SS(board,0,0);
      
    }
    public void SS(char[][] board,int i,int j){
         if(ans) return;
         if(i==9){
             ans=true;
             return;
         }
         if(board[i][j]!='.'){
             if(j<8)
             SS(board,i,j+1);
             else
             SS(board,i+1,0);
             return;
         }
         for(int k=1;k<=9;k++){
             int matnum=find(i,j);
             if(col[j][k-1]==0 && row[i][k-1]==0 && mat[matnum][k-1]==0){
                 board[i][j]=(char)(k+'0');
                 col[j][k-1]=1;row[i][k-1]=1;mat[matnum][k-1]=1;
                 if(j<8)
                   SS(board,i,j+1);
                 else
                   SS(board,i+1,0);
                if(ans==false){   
                col[j][k-1]=0;row[i][k-1]=0;mat[matnum][k-1]=0;
                board[i][j]='.';
                }   
             }
         }
    }
    public int find(int row,int col){
        row=row/3;col=col/3;
        if(row==1)
           row=3;
        else if(row==2)
           row=6;     
        return row+col; 
    }
}

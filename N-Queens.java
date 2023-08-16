class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> ans=new ArrayList<>();
        char board[][]=new char[n][n];
        for(char[] row:board)
        Arrays.fill(row,'.');
        solve(ans,0,board);
       
        return ans;
    }
    public void solve(List<List<String>> ans,int row,char [][] board){
        if(row==board.length)
        {
            ans.add(construct(board));
        }
        for(int col=0;col<board.length;col++){
            if(isValid(board,row,col))
            {
                board[row][col]='Q';
                solve(ans,row+1,board);
                board[row][col]='.';
            }
        }
    }

    private boolean isValid(char[][] board,int i,int j){
        for(int row=0;row<i;row++)
        {
            if(board[row][j]=='Q')
            return false;
        }
        for(int row=i-1,col=j-1; row>=0 && col>=0;row--,col--){
            if(board[row][col]=='Q')
            return false;
        }
        for(int row=i-1,col=j+1; row>=0 && col<board.length;row--,col++){
             if(board[row][col]=='Q')
            return false;
        }
        return true;
    }
    public List<String> construct(char[][] board){
        List<String> li=new ArrayList<>();
        for(int i=0;i<board.length;i++)
        li.add(new String(board[i]));
        return li;
    }  
}

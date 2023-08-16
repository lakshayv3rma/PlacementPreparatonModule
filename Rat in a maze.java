class Solution {
    public int uniquePathsWithObstacles(int[][] grid) {
        int m=grid.length,n=grid[0].length;
        Integer ans[][]=new Integer[m][n];
        return solve(ans,grid,m-1,n-1);
    }
    int solve(Integer[][] ans,int[][] grid,int i,int j){
        if(i==0 && j==0){
            if(grid[i][j]==0)
            return 0;
         return 1;
        } 
        if(ans[i][j]!=null) return ans[i][j];
        if(grid[i][j]==0) return 0;
        ans[i][j]=0;
        if(i>0)
        ans[i][j]+=solve(ans,grid,i-1,j);
        if(j>0)
        ans[i][j]+=solve(ans,grid,i,j-1);
        return ans[i][j];
    }
}

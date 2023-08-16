class Solution {
    public int orangesRotting(int[][] grid) {
        int m=grid.length,n=grid[0].length;
        boolean visited[][]=new boolean[m][n];
        Queue<int[]> q=new LinkedList<int[]>();
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==2){
                    q.offer(new int[]{i,j,0});
                    visited[i][j]=true;
                }
            }
        }
        int[][] dir={{1,0},{-1,0},{0,1},{0,-1}}; 
        int time=0;
        while(!q.isEmpty()){
            int[] curr=q.poll();
            for(int i[]:dir){
                if(curr[0]+i[0]>=0 && curr[0]+i[0]<grid.length && curr[1]+i[1]>=0 && curr[1]+i[1]<grid[0].length){
                    if(!visited[curr[0]+i[0]][curr[1]+i[1]] && grid[curr[0]+i[0]][curr[1]+i[1]]==1){
                        visited[curr[0]+i[0]][curr[1]+i[1]]=true;
                        grid[curr[0]+i[0]][curr[1]+i[1]]=2;
                        time=Math.max(time,curr[2]+1);
                        q.offer(new int[]{curr[0]+i[0],curr[1]+i[1],curr[2]+1});
                    }
                }
            }
        }
         for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==1)
                return -1;
            }
         }
        return time; 
    }
}

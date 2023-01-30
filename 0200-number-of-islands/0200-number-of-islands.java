class Solution {
    public int numIslands(char[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        if(grid==null || m==0 || n==0)
            return 0;
        boolean visited[][] = new boolean[m][n];
        int numofIslands = 0;
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(!visited[i][j] && grid[i][j]=='1')
                {
                    dfs(grid,i,j,visited);
                    numofIslands++;
                }
            }
        }
        return numofIslands;
    }
    private void dfs(char grid[][], int row, int col, boolean visit[][])
    {
        if(row<0 || row>=grid.length|| col<0 || col>=grid[0].length || visit[row][col] || grid[row][col]!='1')
        {
            return;
        }
        visit[row][col] = true;
        //grid[row][col] = '0';
        dfs(grid,row,col-1,visit);  // go left
        dfs(grid,row-1,col,visit);  // go up
        dfs(grid,row,col+1,visit);  // go right
        dfs(grid,row+1,col,visit);  // go down
    }
}
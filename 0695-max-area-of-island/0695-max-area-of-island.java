class Solution {
    
    int row[] = {0,1,0,-1};
    int col[] = {1,0,-1,0};
    
    public int maxAreaOfIsland(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int count = 0;
        
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(grid[i][j]==1)
                    count = Math.max(count, countOne(i,j,n,m,grid));
            }
        }
        return count;
    }
    
    int countOne(int i, int j, int n, int m, int grid[][])
    {
        grid[i][j] = 0;
        int count = 1;
        for(int k=0;k<4;k++)
        {
            int nrow = i + row[k];
            int ncol = j + col[k];
            
            if(nrow>=0 && nrow<n && ncol>=0 && ncol<m && grid[nrow][ncol]==1)
            {
                count += countOne(nrow,ncol,n,m,grid);
            }
        }
        return count;
    }
}
class Solution {
    static int row[] = {0,1,0,-1};
    static int col[] = {1,0,-1,0};
    
    public void solve(char[][] board) {
        int n = board.length;
        int m = board[0].length;
        
        int arr[][] = new int[n][m];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if((i==0 || i==n-1 || j==0 || j==m-1) && board[i][j]=='O' && arr[i][j]==0)
                    makeOne(i,j,n,m,board,arr);
            }
        }
        
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(arr[i][j]==0)
                    board[i][j] = 'X';
            }
        }
    }
    
    static void makeOne(int i, int j, int n, int m, char board[][], int arr[][])
    {
        arr[i][j] = 1;
        for(int k=0;k<4;k++)
        {
            int nrow = i + row[k];
            int ncol = j + col[k];
            
            if(nrow>=0 && nrow<n && ncol>=0 && ncol<m && board[nrow][ncol]=='O' && arr[nrow][ncol]==0)
                makeOne(nrow,ncol,n,m,board,arr);
        }
    }
}
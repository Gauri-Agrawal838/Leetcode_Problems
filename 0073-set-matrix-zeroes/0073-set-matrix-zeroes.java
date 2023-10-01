class Solution {
    public void setZeroes(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        
        int nrow[] = new int[n];
        int ncol[] = new int[m];
        
        Arrays.fill(nrow,1);
        Arrays.fill(ncol,1);
        
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(matrix[i][j]==0)
                {
                    nrow[i] = 0;
                    ncol[j] = 0;
                }
            }
        }
        
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(nrow[i]==0 || ncol[j]==0)
                    matrix[i][j] = 0;
            }
        }
    }
}
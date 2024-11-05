class Solution {
    public void rotate(int[][] mat) {
        int n = mat.length;
        
        //take transpose of matrix
        for(int i=0;i<n;i++)
        {
            for(int j=i;j<n;j++)
            {
                int temp = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = temp;
            }
        }
        
        //now, reverse the matrix to get to rotate it 90 degree
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n/2;j++)
            {
                int temp = mat[i][j];
                mat[i][j] = mat[i][n-1-j];
                mat[i][n-1-j] = temp;
            }
        }
    }
}
// 1 2 3    1 4 7
// 4 5 6 -> 2 5 8
// 7 8 9    3 6 9
class Solution {
    public int[][] generateMatrix(int n) {
        int ans[][] = new int[n][n];
        int top = 0;
        int bottom = n-1;
        int left = 0;
        int right = n-1;
        int k = 1;
        int dir = 1; //fixing direction
        while(top<=bottom && left<=right)
        {
            if(dir==1)
            {
                for(int i=left;i<=right;i++)
                    ans[top][i] = k++;
                top++;
                dir = 2;
            }
            else if(dir==2)
            {
                for(int i=top;i<=bottom;i++)
                    ans[i][right] = k++;
                right--;
                dir = 3;
            }
            else if(dir==3)
            {
                for(int i=right;i>=left;i--)
                    ans[bottom][i] = k++;
                bottom--;
                dir = 4;
            }
            else if(dir==4)
            {
                for(int i=bottom;i>=top;i--)
                    ans[i][left] = k++;
                left++;
                dir = 1;
            }
        }
        return ans;
    }
}
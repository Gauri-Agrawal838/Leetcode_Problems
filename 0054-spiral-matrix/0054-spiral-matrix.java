class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;
        int top = 0;
        int bottom = row-1;
        int left = 0;
        int right = col-1;
        List<Integer> ans = new ArrayList<>();
        int dir = 1; //direction
        while(top<=bottom && left<=right)
        {
            if(dir==1)
            {
                for(int i=left;i<=right;i++)
                    ans.add(matrix[top][i]);
                top++;
                dir = 2;
            }
            else if(dir==2)
            {
                for(int i=top;i<=bottom;i++)
                    ans.add(matrix[i][right]);
                right--;
                dir = 3;
            }
            else if(dir==3)
            {
                for(int i=right;i>=left;i--)
                    ans.add(matrix[bottom][i]);
                bottom--;
                dir = 4;
            }
            else if(dir==4)
            {
                for(int i=bottom;i>=top;i--)
                    ans.add(matrix[i][left]);
                left++;
                dir = 1;
            }
        }
        return ans;
    }
}
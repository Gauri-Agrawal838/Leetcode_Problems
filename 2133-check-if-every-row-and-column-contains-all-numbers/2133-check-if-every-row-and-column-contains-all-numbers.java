class Solution {
    public boolean checkValid(int[][] matrix) {
        int n = matrix.length;
        
        for(int i=0;i<n;i++)
        {
            ArrayList<Integer> list = new ArrayList<>();
            ArrayList<Integer> list2 = new ArrayList<>();
            for(int j=0;j<n;j++)
            {
                list.add(matrix[i][j]);
                list2.add(matrix[j][i]);
            }
            
            int k = 1;
            while(k<=n)
            {
                if(!list.contains(k) || !list2.contains(k))
                    return false;
                k++;
            }
        }
        return true;
    }
}
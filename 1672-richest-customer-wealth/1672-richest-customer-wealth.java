class Solution {
    public int maximumWealth(int[][] accounts) {
        int m = accounts.length;
        int wealth=0;
        for(int i=0;i<m;i++)
        {
            int s=0;
            int n = accounts[i].length;
            for(int j=0;j<n;j++)
                s += accounts[i][j];
            if(s>wealth)
                wealth = s;
        }
        return wealth;
    }
}
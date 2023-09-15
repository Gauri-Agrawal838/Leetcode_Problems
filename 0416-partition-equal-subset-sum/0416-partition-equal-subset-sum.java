class Solution {
    public boolean canPartition(int[] nums) {
        int n = nums.length;
        int sum = 0;
        for(int x:nums)
            sum += x;
        
        if(sum%2!=0)
            return false;
        sum = sum/2;
        
        int dp[][] = new int[n+1][sum+1];
        for(int i=0;i<n;i++)
            dp[i][0] = 1;
        
        for(int i=1;i<=n;i++)
        {
            for(int j=0;j<=sum;j++)
            {
                if(nums[i-1]<=j)
                    dp[i][j] = dp[i-1][j] + dp[i-1][j-nums[i-1]];
                else
                    dp[i][j] = dp[i-1][j];
            }
        }
        
        if(dp[n][sum]!=0)
            return true;
        return false;
    }
}
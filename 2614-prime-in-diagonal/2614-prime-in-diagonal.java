class Solution {
    public int diagonalPrime(int[][] nums) {
        
        int ans  = 0;
        int n = nums.length;
        int m = nums[0].length;
        
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if((i==j) || (i+j)==n-1)
                {
                    ans = Math.max(ans,checkPrime(nums[i][j]));
                }
            }
        }
        return ans;
    }
    
    int checkPrime(int val)
    {
        if(val<2)
            return 0;
        if(val==2)
            return 2;
        for(int i=2;i<=Math.sqrt(val);i++)
        {
            if(val%i==0)
                return 0;
        }
        return val;
    }
}
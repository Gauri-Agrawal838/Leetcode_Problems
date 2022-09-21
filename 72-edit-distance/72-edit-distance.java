class Solution {
    public int minDistance(String word1, String word2) {
        char[] str1 = word1.toCharArray();
        char[] str2 = word2.toCharArray();
        int dp[][] = new int[str1.length+1][str2.length+1];
        dp[0][0] = 0;
        for(int i=0;i<dp.length;i++)
            dp[i][0] = i;
        for(int j=0;j<dp[0].length;j++)
            dp[0][j] = j;
        
        for(int i=1;i<str1.length+1;i++)
        {
            for(int j=1;j<str2.length+1;j++)
            {
                if(str1[i-1]==str2[j-1])
                    dp[i][j] = dp[i-1][j-1];
                else
                    dp[i][j] = 1 + Math.min(dp[i-1][j-1],Math.min(dp[i-1][j], dp[i][j-1]));
            }
        }
        return dp[str1.length][str2.length];
    }
}
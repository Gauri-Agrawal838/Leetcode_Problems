class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        char[] str1 = text1.toCharArray();
        char[] str2 = text2.toCharArray();
        int m = str1.length + 1;
        int n = str2.length + 1;
        int dp[][] = new int[m][n];
        int max = 0;
        for(int i=1;i<dp.length;i++)
        {
            for(int j=1;j<dp[i].length;j++)
            {
               if(str1[i-1]==str2[j-1])
                    dp[i][j] = dp[i-1][j-1] + 1;
                else
                    dp[i][j] = Math.max(dp[i][j-1], dp[i-1][j]);
            
            if(dp[i][j] > max)
                max = dp[i][j];
            }
        }
        return max;
    }
}

// dp[0,0] is known as bottom up approach or base condition
// diagnol + 1 if the characters match
// max(left value, top value) (from the 2-D matrix) if the characters doesn't match
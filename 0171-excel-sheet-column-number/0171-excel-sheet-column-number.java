class Solution {
    public int titleToNumber(String columnTitle) {
        // char ch[] = columnTitle.toCharArray();
        int n = columnTitle.length();
        int ans = 0;
        int m = n;
        for(int i=0;i<n;i++)
        {
            int v = (columnTitle.charAt(i) - 'A') + 1;
            ans += (int)Math.pow(26,m-1) * v;
            m--;
        }
        return ans;
    }
}
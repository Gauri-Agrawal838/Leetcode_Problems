class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int sum = 0;
        int lefty[] = new int[n];
        int righty[] = new int[n];
        lefty[0] = height[0];
        righty[n-1] = height[n-1];
        for(int i=1;i<n;i++)
            lefty[i] = Math.max(lefty[i-1],height[i]);
        for(int i=n-2;i>=0;i--)
            righty[i] = Math.max(righty[i+1],height[i]);
        for(int i=0;i<n;i++)
            sum += Math.min(lefty[i],righty[i])-height[i];
        return sum;
    }
}
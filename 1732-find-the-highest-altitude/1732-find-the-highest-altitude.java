class Solution {
    public int largestAltitude(int[] gain) {
        int al=0;
        int ans[] = new int[gain.length+1];
        ans[0]=0;
        for(int i=0;i<gain.length;i++)
        {
            al += gain[i];
            ans[i+1] += al;
            
        }
        int max=ans[0];
        for(int n:ans)
        {
            max=Math.max(n,max);
        }
        return max;
    }
}
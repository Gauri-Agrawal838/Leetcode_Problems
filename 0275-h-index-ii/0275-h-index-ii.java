class Solution {
    public int hIndex(int[] citations) {
        int n = citations.length;
        int low=0, high=n;
        
        // for(int i=0;i<citations.length;i++)
        // {
        //     if(citations[i]>=n-i)
        //         return n-i;
        // }
        
        int ans = 0;
        while(low<high)
        {
            int mid = low + (high-low)/2;
            if(citations[mid]>=n-mid)
            {
                ans = Math.max(ans,n-mid);
                high = mid;
            }
            else 
                low = mid+1; 
        }
        return ans;
    }
}
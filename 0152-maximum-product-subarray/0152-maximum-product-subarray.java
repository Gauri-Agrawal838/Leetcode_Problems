class Solution {
    public int maxProduct(int[] nums) {
        int max = Integer.MIN_VALUE;
        int n = nums.length;
        int p1=1, p2=1;
        for(int i=0;i<n;i++)
        {
            p1 *= nums[i];
            p2 *= nums[n-i-1];
            
            max = Math.max(max, Math.max(p1,p2));
            if(p1==0)
                p1 = 1;
            if(p2==0)
                p2 = 1;
        }
        return max;
    }
}
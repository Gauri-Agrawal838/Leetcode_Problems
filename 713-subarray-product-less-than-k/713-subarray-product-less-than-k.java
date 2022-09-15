class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int len = nums.length;
        if(len<=0)
            return 0;
        int count = 0;
        for(int i=0;i<nums.length;i++)
        {
            int prod = nums[i];
            if(prod<k)
                count++;
            for(int j=i+1;(j<len && prod<k);j++)
            {
                prod *= nums[j];
                if(prod<k)
                    count++;
            }
                
        }
        return count;
    }
}

//sliding window technique is used  above
class Solution {
    public int findGCD(int[] nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int hcf=0;
        for(int i=0;i<nums.length;i++)
        {
            if(min>nums[i])
                min = nums[i];
            if(max<nums[i])
                max = nums[i];
        }
        for(int i=1;i<=min;i++)
        {
            if(max%i==0 && min%i==0)
                hcf = i;
        }
        return hcf;
    }
}
class Solution {
    public int sumOfUnique(int[] nums) {
        int f=0, sum=0;
        for(int i=0;i<nums.length;i++)
        {
            for(int j=0;j<nums.length;j++)
            {
                if(i==j)
                    continue;
                if(nums[i]==nums[j])
                    f=1;
            }
            if(f==0)
                sum += nums[i];
            f=0;
        }
        return sum;
    }
}
class Solution {
    public long largestPerimeter(int[] nums) {
        long total = 0;
        for(int x : nums)
            total += x;
        Arrays.sort(nums);
        for(int i=nums.length-1;i>=2;i--)
        {
            if(total-nums[i]>nums[i])
                return total;
            total -= nums[i];
        }
        return -1;
    }
}
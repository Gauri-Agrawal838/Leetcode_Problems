class Solution {
    public int findClosestNumber(int[] nums) {
        Arrays.sort(nums);
        int diff = Integer.MAX_VALUE;
        int ans = 0;
        for(int i=0;i<nums.length;i++)
        {
            int temp = Math.abs(0- nums[i]);
            if(diff>=temp)
            {
                diff = temp;
                ans = nums[i];
            }
        }
        return ans;
    }
}
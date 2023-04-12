class Solution {
    public int majorityElement(int[] nums) {
        int maj_index = 0, count=1;
        for(int i=1;i<nums.length;i++)
        {
            count += nums[i] == nums[maj_index] ? 1 : -1;
            if(count==0)
            {
                maj_index = ++i;
                count++;
            }
            
        }
        
        return nums[maj_index];
    }
}
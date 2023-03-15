class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new LinkedList<>();
        if(nums.length==0 || nums.length<3)
            return ans;
        Arrays.sort(nums);
        for(int i=0;i<nums.length-2;i++)
        {
            if(i==0 || (i>0 && nums[i]!=nums[i-1]))
            {
                int low = i+1, high = nums.length-1;
                int sum = 0 - nums[i]; // if nums[i] = -4 then it will become 4 and we will check is there are any two numbers present whose sum is equals to 4, so that after adding three of the numbers we can get 0 as a sum.
                while(low<high)
                {
                    if(nums[low]+nums[high]==sum)
                    {
                        ans.add(Arrays.asList(nums[i],nums[low],nums[high]));
                        while(low<high && nums[low] == nums[low+1])
                            low++;
                        while(low<high && nums[high] == nums[high-1])
                            high--;
                        low++;
                        high--;
                    }
                    else if(nums[low]+nums[high]<sum)
                        low++;
                    else
                        high--;
                }
            }
        }
        return ans;
    }
}
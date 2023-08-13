class Solution {
    public int singleNumber(int[] nums) {
        Set<Integer> set = new HashSet<>();
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<nums.length;i++)
        {
            if(set.contains(nums[i])||list.contains(nums[i]))
            {
                set.remove(nums[i]);
                list.add(nums[i]);
            }
            else
                set.add(nums[i]);
        }
        int ans = 0;
        for(int x:set)
            ans = x;
        return ans;
    }
}
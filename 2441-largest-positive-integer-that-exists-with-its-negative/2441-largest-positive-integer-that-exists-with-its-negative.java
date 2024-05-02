class Solution {
    public int findMaxK(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int x:nums)
            list.add(x);
        Arrays.sort(nums);
        
        for(int i=nums.length-1;i>=0;i--)
        {
            int val = (-1) * nums[i];
            if(list.contains(val))
                return nums[i];
        }
        return -1;
    }
}
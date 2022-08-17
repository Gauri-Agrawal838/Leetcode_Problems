class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        List<Integer> arr = new ArrayList<>();
        int c=0, left=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==target)
                c++;
            if(target>nums[i])
                left++;
        }
        for(int i=0;i<c;i++)
            arr.add(i+left);
        return arr;
    }
}
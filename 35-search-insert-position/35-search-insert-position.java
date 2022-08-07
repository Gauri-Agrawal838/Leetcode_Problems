class Solution {
    public int searchInsert(int[] nums, int target) {
        int ans = 0, f=0;
        for(int i=0; i<nums.length; i++){
            if(target==nums[i]){
                ans=i;
                f=1;
                break;
            }
        }
        if(f==0)
        {
            for(int i=nums.length-1; i>=0; i--)
            {
                if(nums[i]<target){
                    ans=i+1;
                    break;
                }
            }
        }
        return ans;
    }
}
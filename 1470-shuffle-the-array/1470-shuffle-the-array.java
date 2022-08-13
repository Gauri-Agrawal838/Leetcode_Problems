class Solution {
    public int[] shuffle(int[] nums, int n) {
        int ans[] = new int[nums.length], j=0;
        for(int i=0;i<nums.length/2;i++)
        {
            ans[j] = nums[i];
            ans[j+1] = nums[i+n];
            j += 2;
        }
        return ans;
    }
}
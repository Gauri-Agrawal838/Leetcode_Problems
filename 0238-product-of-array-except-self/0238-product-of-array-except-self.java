class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int ans[] = new int[nums.length];
        int temp = 1;
        
        //left-pass
        for(int i=0;i<n;i++)
        {
            ans[i] = temp;
            temp = temp * nums[i];
        }
        
        temp=1;
        //right-pass
        for(int i=n-1;i>=0;i--)
        {
            ans[i] *= temp;
            temp = temp*nums[i];
        }
        return ans;
    }
}
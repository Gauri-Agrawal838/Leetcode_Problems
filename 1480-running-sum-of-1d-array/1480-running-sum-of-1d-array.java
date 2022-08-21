class Solution {
    public int[] runningSum(int[] nums) {
        int n = nums.length, s=0;
        int[] sum = new int[n];
        for(int i=0; i<n; i++){
            sum[i] = s + nums[i];
            s = s + nums[i];
        }
        return sum;
    }
}
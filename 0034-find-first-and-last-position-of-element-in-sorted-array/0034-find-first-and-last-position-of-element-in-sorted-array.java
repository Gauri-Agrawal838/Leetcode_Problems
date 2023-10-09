class Solution {
    public int[] searchRange(int[] nums, int target) {
        int ans[] = new int[2];
        int n = nums.length;
        ans[0] = bs1(nums,0,n-1,target);
        ans[1] = bs2(nums,0,n-1,target);
        return ans;
    }
    
    int bs1(int nums[], int low, int high, int x)
    {
        int res = -1;
        while(low<=high)
        {
            int mid = low + (high-low)/2;
            if(nums[mid]<x)
                low = mid + 1;
            else
            {
                if(nums[mid]==x)
                    res = mid;
                high = mid - 1;
            }
        }
        return res;
    }
    
    int bs2(int nums[], int low, int high, int x)
    {
        int res = -1;
        while(low<=high)
        {
            int mid = low + (high-low)/2;
            if(nums[mid]>x)
                high = mid - 1;
            else
            {
                if(nums[mid]==x)
                    res = mid;
                low = mid + 1;
            }
        }
        return res;
    }
}
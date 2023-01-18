class Solution {
    public int arraySign(int[] nums) {
        int count = 0, f=0;
        for(int x=0;x<nums.length;x++)
        {
            if(nums[x]<0)
                count++;
            else if(nums[x]==0)
                f=1;
        }
        if(count%2==0 && f==0)
            return 1;
        else if(f==1)
            return 0;
        return -1;
    }
}
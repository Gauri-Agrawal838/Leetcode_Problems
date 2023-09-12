class Solution {
    public int[] maxSubsequence(int[] nums, int k) {
        
        List<Integer> list = new ArrayList<>();
        for(int x=0;x<nums.length;x++)
            list.add(nums[x]);
        
        while(k<list.size())
        {
            int min = Collections.min(list);
            list.remove(Integer.valueOf(min));
        }
        
        int ans[] = new int[k];
        for(int i=0;i<k;i++)
        {
            ans[i] = list.get(i);
        }
        return ans;
    }
}
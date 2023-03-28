class Solution {
    public List<Integer> largestDivisibleSubset(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        if(nums==null || nums.length==0)
            return ans;
        Arrays.sort(nums);
        List<List<Integer>> dp = new ArrayList<>();
        for(int num : nums)
            dp.add(new ArrayList<>());
        for(int i=0;i<nums.length;i++)
        {
            List<Integer> max = new ArrayList<>();
            for(int j=0;j<i;j++)
            {
                if(nums[i]%nums[j]==0 && max.size()<dp.get(j).size())
                    max = dp.get(j);
            }
            dp.get(i).addAll(max);
            dp.get(i).add(nums[i]);
        }
        for(int i=0;i<dp.size();i++)
        {
            if(ans.size()<dp.get(i).size())
                ans = dp.get(i);
        }
        return ans;
    }
}
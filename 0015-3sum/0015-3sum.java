class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        // List<List<Integer>> li = new ArrayList<ArrayList<Integer>>;
        Set<List<Integer>> set = new HashSet<>();
        int n = nums.length;
        Arrays.sort(nums);
        for(int i=0;i<n-2;i++)
        {
            int j = i+1;
            int sum = 0, k = n-1;
            while(j<k)
            {
                sum = nums[i] + nums[j] + nums[k];
                if(sum==0)
                {
                    set.add(Arrays.asList(nums[i],nums[j],nums[k]));
                    j++;
                    k--;
                }
                if(sum<0)
                    j++;
                if(sum>0)
                    k--;
            }
        }
        return new ArrayList<>(set);
    }
}
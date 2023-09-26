class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> list = new ArrayList<>();
        HashSet<List<Integer>> hs = new HashSet<>();
        
        Arrays.sort(nums);
        int n = nums.length;
        for(int i=0;i<n-1;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                int s = j+1;
                int e = n-1;
                
                while(s<e)
                {
                    long sum = (long)nums[i] + (long)nums[j] + (long)nums[s] + (long)nums[e];
                    if(sum==target)
                    {
                        ArrayList<Integer> sublist = new ArrayList<>(Arrays.asList(nums[i],nums[j],nums[s],nums[e]));
                        if(!hs.contains(sublist))
                        {
                            list.add(sublist);
                            hs.add(sublist);
                        }
                        s++;
                        e--;
                    }
                    else if(sum<target)
                        s++;
                    else
                        e--;
                }
            }
        }
        return list;
    }
}
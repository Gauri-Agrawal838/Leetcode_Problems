class Solution {
    public int mostFrequentEven(int[] nums) {
        Arrays.sort(nums);
        HashMap<Integer,Integer> hm = new HashMap<>();
        
        int max = -1;
        int max_e = -1;
        
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]%2==0)
            {
                int value = hm.getOrDefault(nums[i], 0);
                hm.put(nums[i], value+1);
                
                if(max<hm.get(nums[i]))
                {
                    max = hm.get(nums[i]);
                    max_e = nums[i];
                }
            }
        }
        return max_e;
    }
}
class Solution {
    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            if(!hm.containsKey(nums[i]))
                hm.put(nums[i], 1);
            else
                hm.put(nums[i], hm.get(nums[i])+1);
        }
        
        int max = 0;
        int count = 0;
        for(Map.Entry<Integer,Integer> entry : hm.entrySet())
        {
            if(max<entry.getValue())
                max = entry.getValue();
        }
        
        for(Map.Entry<Integer,Integer> entry : hm.entrySet())
        {
            if(max==entry.getValue())
                count += entry.getValue();
        }
        
        return count;
    }
}
class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> list = new ArrayList<>();
        HashMap<Integer,Integer> hm = new HashMap<>();
        int n = nums.length/3;
        
        for(int i=0;i<nums.length;i++)
        {
            int value = hm.getOrDefault(nums[i],0);
            hm.put(nums[i], value+1);
            
            if(hm.get(nums[i])>n && !list.contains(nums[i]))
                list.add(nums[i]);
        }
        return list;
    }
}
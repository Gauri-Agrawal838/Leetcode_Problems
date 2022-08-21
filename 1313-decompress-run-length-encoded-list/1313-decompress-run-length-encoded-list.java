class Solution {
    public int[] decompressRLElist(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        for(int i=0;i<nums.length;i+=2)
        {
            int freq = nums[i];
            int val = nums[i+1];
            while(freq>0)
            {
                ans.add(val);
                freq--;
            }
        }
        int arr[] = new int[ans.size()];
        for(int i=0;i<ans.size();i++)
            arr[i] = ans.get(i);
        return arr;
    }
}
class Solution {
    public int[] singleNumber(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int i=0;i<nums.length;i++)
        {
            if(set.contains(nums[i]))
                set.remove(nums[i]);
            else
                set.add(nums[i]);
        }
        int arr[] = new int[2];
        int i=0;
        for(int x:set)
            arr[i++] = x;
        Arrays.sort(arr);
        return arr;
    }
}
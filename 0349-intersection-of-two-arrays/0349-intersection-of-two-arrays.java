class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        
        for(int i:nums1)
            set1.add(i);
        for(int i:nums2)
            set2.add(i);
        
        Set<Integer> Main_set = new HashSet<>();
        
        for(Integer var:set1)
        {
            if(set2.contains(var))
                Main_set.add(var);
        }
        
        int arr[] = new int[Main_set.size()];
        int j=0;
        for(Integer val:Main_set)
            arr[j++] = val.intValue();
        return arr;
    }
}
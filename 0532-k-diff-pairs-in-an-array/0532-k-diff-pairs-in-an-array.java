class Solution {
    public int findPairs(int[] nums, int k) {
        int count=0;
        HashMap<Integer,Integer> mp = new HashMap<>();
        for(int x:nums)
            mp.put(x, mp.getOrDefault(x,0)+1);
        for(int x:mp.keySet())
        {
            if(k>0 && mp.containsKey(x+k) || k==0 && mp.get(x)>1)
                count++;
        }
            
        return count;
    }
}
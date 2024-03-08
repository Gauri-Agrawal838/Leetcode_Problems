class Solution {
    public boolean areOccurrencesEqual(String s) {
        HashMap<Character,Integer> hm = new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
            char x = s.charAt(i);
            hm.put(x, hm.getOrDefault(x,0)+1);
        }
        
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(Map.Entry<Character,Integer> entry : hm.entrySet())
        {
            max = Math.max(max,entry.getValue());
            min = Math.min(min,entry.getValue());
        }
        if(max!=min)
            return false;
        return true;
    }
}
class Solution {
    public int romanToInt(String s) {
        HashMap<Character, Integer> hm = new HashMap<>();
        hm.put('I', 1);
        hm.put('V', 5);
        hm.put('X', 10);
        hm.put('L', 50);
        hm.put('C', 100);
        hm.put('D', 500);
        hm.put('M', 1000);
        
        int n = s.length();
        int res = hm.get(s.charAt(n-1));
        
        for(int i=n-2;i>=0;i--)
        {
            int curr = hm.get(s.charAt(i));
            int last = hm.get(s.charAt(i+1));
            
            if(curr<last)
                res -= curr;
            else
                res += curr;
        }
        return res;
    }
}
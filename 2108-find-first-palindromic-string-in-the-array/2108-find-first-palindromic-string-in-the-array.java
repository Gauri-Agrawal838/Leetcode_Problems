class Solution {
    public String firstPalindrome(String[] words) {
        for(int i=0;i<words.length;i++)
        {
            String s = words[i];
            boolean res = checkPalin(s);
            if(res==true)
                return s;
        }
        return "";
    }
    
    boolean checkPalin(String s)
    {
        int j = s.length()-1;
        for(int i=0;i<s.length()/2;i++)
        {
            if(s.charAt(i)!=s.charAt(j))
                return false;
            j--;
        }
        return true;
    }
}
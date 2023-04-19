class Solution {
    public boolean isMatch(String s, String p) {
        int i=0, j=0;
        int startIdx = -1, lastMatch = -1;
        while(i<s.length())
        {
            if(j<p.length()&&(s.charAt(i)==p.charAt(j)||p.charAt(j)=='?'))
            {
                i++;
                j++;
            }
            else if(j<p.length() && p.charAt(j)=='*')
            {
                startIdx = j;
                lastMatch = i;
                j++;
            }
            else if(startIdx!=-1)
            {
                j=startIdx+1;
                lastMatch++;
                i = lastMatch;
            }
            else
                return false;
        }
        boolean isMatch = true;
        while(j<p.length()&&p.charAt(j)=='*')
            j++;
        if(i!=s.length()||j!=p.length())
            isMatch = false;
        return isMatch;
    }
}
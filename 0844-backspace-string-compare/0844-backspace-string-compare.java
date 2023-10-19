class Solution {
    public boolean backspaceCompare(String s, String t) {
        String p = "";
        String q = "";
        
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)>='a' && s.charAt(i)<='z')
                p += s.charAt(i);
            else if(!p.isEmpty())
                p = removeLastChar(p);
        }
        
        for(int i=0;i<t.length();i++)
        {
            if(t.charAt(i)>='a' && t.charAt(i)<='z')
                q += t.charAt(i);
            else if(!q.isEmpty())
                q = removeLastChar(q);
        }
        
        if(p.equals(q))
            return true;
        return false;
    }
    
    String removeLastChar(String str)
    {
        return str.substring(0, str.length()-1);
    }
}
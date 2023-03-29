class Solution {
    public String removeStars(String s) {
        char ch[] = s.toCharArray();
        int j=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='*')
                j--;
            else
            {
                ch[j] = ch[i];
                j++;
            }
        }
        return String.valueOf(ch).substring(0,j);
    }
}
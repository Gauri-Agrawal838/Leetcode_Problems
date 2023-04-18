class Solution {
    public String mergeAlternately(String word1, String word2) {
        int a = word1.length();
        int b = word2.length();
        String str = "";
        for(int i=0; i<(a+b);i++)
        {
            if(i<a)
                str += word1.charAt(i);
            if(i<b)
                str += word2.charAt(i);
        }
        return str;
    }
}
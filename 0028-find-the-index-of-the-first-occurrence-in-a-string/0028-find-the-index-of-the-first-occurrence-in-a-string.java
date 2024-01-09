class Solution {
    public int strStr(String haystack, String needle) {
        for(int i=0;i<=haystack.length()-needle.length();i++)
        {
            int k = 0;
            while(k<needle.length() && needle.charAt(k)==haystack.charAt(i+k))
                k++;
            if(k==needle.length())
                return i;
        }
        return -1;
    }
}
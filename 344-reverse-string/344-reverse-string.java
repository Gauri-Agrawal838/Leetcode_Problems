class Solution {
    public void reverseString(char[] s) {
        swap(s, 0, s.length-1);
    }
    public void swap(char[] s, int start, int end)
    {
        if (start >= end) return;
        char temp = s[start];
        s[start++] = s[end];
        s[end--] = temp;
        swap(s, start, end);
    }
}
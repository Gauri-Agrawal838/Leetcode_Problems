class Solution {
    public String maximumOddBinaryNumber(String s) {
        int count=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='1')
                count++;
        }
        if(count==0)
            return s;
        String ans = "";
        int zeros = s.length()-count;
        while(count>1)
        {
            ans += "1";
            count--;
        }
        
        while(zeros>0)
        {
            ans += "0";
            zeros--;
        }
        ans += "1";
        return ans;
    }
}
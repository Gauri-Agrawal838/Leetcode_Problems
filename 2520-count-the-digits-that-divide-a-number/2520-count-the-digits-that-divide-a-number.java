class Solution {
    public int countDigits(int num) {
        int m = num;
        int c=0;
        while(num>0)
        {
            int rem = num%10;
            if(m%rem==0)
                c++;
            num /= 10;
        }
        return c;
    }
}
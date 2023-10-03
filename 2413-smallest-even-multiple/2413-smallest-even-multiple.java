class Solution {
    public int smallestEvenMultiple(int n) {
        if(n%2==0)
            return n;
        int m = n;
        while(true)
        {
            m++;
            if((m%2==0)&&(m%n)==0)
                return m;
        }
    }
}
class Solution {
    public int fib(int n) {
        int a=-1, b=1, ans=0;
        for(int i=0; i<n+1; i++)
        {
            ans = a+b;
            a=b;
            b=ans;
        }
        return ans;
    }
}
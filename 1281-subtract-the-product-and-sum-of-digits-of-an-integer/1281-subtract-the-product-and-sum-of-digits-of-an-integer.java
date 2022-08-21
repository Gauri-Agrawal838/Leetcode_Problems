class Solution {
    public int subtractProductAndSum(int n) {
        int p=1, s=0, d=0;
        while(n>0)
        {
            s = s + n%10;
            p = p * (n%10);
            n/=10;
        }
        d = p-s;
        return d;
    }
}
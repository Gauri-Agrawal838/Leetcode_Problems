class Solution {
    public int mySqrt(int x) {
        int ans = 0;
        if(x==0)
            return x;
        ans = (int)Math.pow(x,0.5);
        return ans;
    }
}
class Solution {
    public int hammingDistance(int x, int y) {
        int ans = x^y;
        int c=0, mask=1;
        for(int i=1;i<=32;i++)
        {
            if((ans & mask) !=0)
                c++;
            mask <<=1;
        }
        return c;
    }
}
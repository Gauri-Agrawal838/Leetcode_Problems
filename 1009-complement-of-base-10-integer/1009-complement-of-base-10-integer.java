class Solution {
    public int bitwiseComplement(int n) {
        int res=0, power=1, bit;
        if(n==0)
            return 1;
        while(n>0)
        {
            bit = (n&1);
            if(bit==0)
                res += power*1; 
            n = n>>1;
            power *= 2;
        }
        return res;
    }
}

// 5 = 1 0 1
// if(bit==1)
//     then it's complement will be equal to 0 and 0 will not contribute to answer
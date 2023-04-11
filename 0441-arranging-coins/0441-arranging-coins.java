class Solution {
    public int arrangeCoins(int n) {
        long left=0, right=n;
        while(left<=right)
        {
            long mid = left + (right-left)/2;
            long k = mid*(mid+1)/2;
            if(k==n)
                return (int)mid;
            else if(k>n)
                right = mid-1;
            else
                left = mid+1;
        }
        return (int)right;
    }
}

// n(n+1)/2

// 5stairs -> 15coins
// 2stairs -> 3 coins
// 3stairs -> 6 coins
class Solution {
    public boolean isPerfectSquare(int num) {
        long left=1, right=num, mid=0;
        while(left<=right)
        {
            mid = left + (right-left)/2;
            if(mid*mid==num)
                return true;
            if(mid*mid<num)
                left = mid+1;
            else
                right=mid-1;
        }
        return false;
    }
}
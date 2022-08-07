class Solution {
    public boolean isPalindrome(int x) {
        int m = x, rem=0, ans=0;
        while(x>0)
        {
            rem = x%10;
            ans = ans*10 + rem;
            x/=10;
        }
        if(ans==m)
            return true;
        else
            return false;
    }
}
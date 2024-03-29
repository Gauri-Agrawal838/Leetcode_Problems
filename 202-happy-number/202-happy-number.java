class Solution {
    public boolean isHappy(int n) {
        List arr = new ArrayList();
        while(n!=1)
        {
            int temp = n;
            n = 0;
            while(temp>0)
            {
                n = n + (int)Math.pow((temp%10),2);
                temp /= 10;
            }
            if(arr.contains(n))
                return false;
            else
                arr.add(n);
        }
        return true;
    }
}
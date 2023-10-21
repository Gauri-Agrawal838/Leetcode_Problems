class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> list = new ArrayList<>();
        for(int i=left;i<=right;i++)
        {
            if(check(i))
                list.add(i);
        }
        return list;
    }
    
    boolean check(int num)
    {
        int m = num;
        while(m>0)
        {
            int rem = m%10;
            if(rem==0 || num%rem!=0)
                return false;
            m /= 10;
        }
        return true;
    }
}
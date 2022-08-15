class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int x=0;
        for(String s:operations){
            if(s.charAt(0) == '+')
                ++x;
            else if(s.charAt(0) == '-')
                --x;
            else if(s.charAt(1) == '+')
                x++;
            else if(s.charAt(1) == '-')
                x--;
        }
        return x;
    }
}
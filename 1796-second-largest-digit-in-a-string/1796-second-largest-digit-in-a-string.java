class Solution {
    public int secondHighest(String s) {
        char ch[] = s.toCharArray();
        int largest=-1, second_largest=-1;
        for(char c:ch)
        {
            if(Character.isDigit(c))
            {
                int digit = c - '0';
                if(digit>largest)
                {
                    second_largest = largest;
                    largest = digit;
                }
                else if(digit<largest && digit>second_largest)
                    second_largest = digit;
            }
        }
        return second_largest;
    }
}
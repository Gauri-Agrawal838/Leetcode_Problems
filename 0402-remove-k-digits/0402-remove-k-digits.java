class Solution {
    public String removeKdigits(String num, int k) {
        Stack<Character> st = new Stack<>();
        for(int i=0;i<num.length();i++)
        {
            char c = num.charAt(i);
            while(!st.isEmpty() && st.peek()>c && k>0)
            {
                st.pop(); //maintaining stack in ascending order
                k--; //number of deletion
            }
            
            if(!st.isEmpty()) //push c irrespective whether it is 0 or not
                st.push(c);
            if(st.isEmpty() && c!='0')
                st.push(c);
            if(st.isEmpty() && c=='0') //don't push if it 0 i.e. no leading zeros
                continue;
        }
        //if number of deletions remaining > 0
        while(!st.isEmpty() && k>0)
        {
            st.pop();
            k--;
        }
        
        if(st.isEmpty())
            return "0";
        StringBuilder sb = new StringBuilder();
        for(char x : st)
            sb.append(x);
        return sb.toString();
    }
}
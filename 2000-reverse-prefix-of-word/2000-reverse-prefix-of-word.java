class Solution {
    public String reversePrefix(String word, char ch) {
        Stack<Character> st = new Stack<>();
        StringBuilder res = new StringBuilder();
        
        int i = 0;
        while(i<word.length())
        {
            st.push(word.charAt(i));
            if(word.charAt(i)==ch)
            {
                while(!st.isEmpty())
                    res.append(st.pop());
                i++;
                
                while(i<word.length())
                    res.append(word.charAt(i++));
                return res.toString();
            }
            i++;
        }
        return word;
    }
}
class Solution {
    public String interpret(String command) {
        String str = "";
        char ch[] = command.toCharArray();
        for(int i=0;i<command.length();i++)
        {
            if(ch[i]=='G')
                str += ch[i];
            else if(ch[i]=='(' && ch[i+1]==')')
            {
                str += 'o';
                i++;
            }
            else if(ch[i]=='(' && ch[i+1]=='a')
            {
                str += 'a';
                str += 'l';
                i+=3;
            }
        }
        return str;
    }
}
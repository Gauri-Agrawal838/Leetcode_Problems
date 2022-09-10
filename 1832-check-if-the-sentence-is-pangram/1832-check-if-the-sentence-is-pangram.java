class Solution {
    public boolean checkIfPangram(String sentence) {
        for(char c='a';c<='z';c++)
        {
            int index = sentence.indexOf(c);
            if(index==-1)
                return false;
        }
        return true;
    }
}
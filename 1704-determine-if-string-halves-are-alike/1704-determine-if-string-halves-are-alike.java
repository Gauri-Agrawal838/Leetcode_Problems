class Solution {
    public boolean halvesAreAlike(String s) {
        if(s.length()%2!=0)
            return false;
        ArrayList<Character> list = new ArrayList<>();
        list.add('a');
        list.add('e');
        list.add('i');
        list.add('o');
        list.add('u');
        
        s = s.toLowerCase();
        
        int count1 = 0;
        int count2 = 0;
        for(int i=0;i<s.length()/2;i++)
        {
            if(list.contains(s.charAt(i)))
                count1++;
        }
        for(int i=s.length()/2;i<s.length();i++)
        {
            if(list.contains(s.charAt(i)))
                count2++;
        }
            
        if(count1==count2)
            return true;
        return false;
    }
}
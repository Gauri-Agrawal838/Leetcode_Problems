class Solution {
    public String reverseWords(String s) {
        char arr[] = s.toCharArray();
        int start = 0;
        int end = 0;
        
        while(start<arr.length)
        {
            while(end<arr.length && arr[end]!=' ')
                end++;
            
            reverse(start,end-1,arr);
            start = end+1;
            end = end+1;
        }
        return new String(arr);
    }
    
    private void reverse(int left, int right, char arr[])
    {
        while(left<right)
        {
            char temp = arr[left];
            arr[left++] = arr[right];
            arr[right--] = temp;
        }
    }
}
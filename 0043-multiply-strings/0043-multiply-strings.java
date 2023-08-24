class Solution {
    public String multiply(String num1, String num2) {
        int n = num1.length();
        int m = num2.length();
        
        int arr[] = new int[n+m];
        for(int i=n-1;i>=0;i--)
        {
            int k = i+m;
            int carry = 0;
            for(int j=m-1;j>=0;j--)
            {
                int x = (num1.charAt(i)-'0')*(num2.charAt(j)-'0') + carry + arr[k];
                arr[k] = x%10;
                carry = x/10;
                k--;
            }
            if(carry>0)
                arr[k] = carry;
        }
        
        String str = "";
        boolean flag = true;
        for(int i=0;i<n+m;i++)
        {
            while(i<n+m && flag==true && arr[i]==0)
                i++;
            flag = false;
            if(i<n+m)
                str += arr[i];
        }
        
        if(str.length()==0)
            return "0";
        return str;
    }
}
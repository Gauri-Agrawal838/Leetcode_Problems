//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            int n = sc.nextInt();
            int d = sc.nextInt();
            
            Solution ob = new Solution();
            
            ArrayList<Integer> res = ob.rotate (n, d);
            System.out.println(res.get(0));
            System.out.println(res.get(1));
            
           
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    
    ArrayList<Integer> rotate(int n, int d)
    {
        // your code here
        int arr[] = new int[16];
        d = d%16;
        for(int i=0;i<16;i++)
        {
            arr[i] = (n&1)==1?1:0;
            n = n>>1; // n = n/2;
        }
        int left=0, right=0;
        int j = 0;
        int x = (16-d)%16;
        int y = d;
        
        while(j<16)
        {
            if(arr[x]==1)
                left += 1<<j;
            if(arr[y]==1)
                right += 1<<j;
            x = (x+1)%16;
            y = (y+1)%16;
            j++;
        }
        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(left);
        ans.add(right);
        return ans;
    }
}
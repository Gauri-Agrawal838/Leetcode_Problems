class Solution {
    public boolean canMakeArithmeticProgression(int[] arr) {
        // Arrays.sort(arr);
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]>arr[j])
                {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        int diff = arr[1]-arr[0];
        for(int i=0;i<arr.length-1;i++)
        {
            if(arr[i+1]-arr[i]!=diff)
                return false;
        }
        return true;
    }
}
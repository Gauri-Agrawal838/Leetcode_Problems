class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int len = nums1.length + nums2.length;
        int[] arr = new int[len];
        int i,j;
        for(i=0;i<nums1.length;i++)
        {
            arr[i] = nums1[i];
            j=i;
        }
        j=i;
        for(i=0;i<nums2.length;i++)
            arr[j++] = nums2[i];
        Arrays.sort(arr);
        double ans=0.0;
        if(len%2!=0)
            ans = arr[(len)/2];
        else
        {
            ans = (arr[(len-1)/2]+arr[(len)/2])/2.0;
        }
        return ans;
    }
}
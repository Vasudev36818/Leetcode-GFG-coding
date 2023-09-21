class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m=nums1.length;double median;
        int n=nums2.length;
        int arr[]=new int[m+n];
        for(int i=0;i<arr.length;i++)
        {
            if(i<m)
            arr[i]=nums1[i];
            else
            {
            arr[i]=nums2[n-1];
            n--;
            }
        }
        Arrays.sort(arr);
        if(arr.length%2==0)
        {
            n=arr.length/2;
            m=(arr.length/2)-1;
            median=arr[m]+arr[n];
            median=median/2;
        }
        else
        {
           median=arr[arr.length/2];
        }
     return median;
        
    }
}
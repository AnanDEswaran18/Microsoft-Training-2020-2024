class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m=0,n=0;
        int len= nums1.length + nums2.length;
        int[] arr=new int[(len/2)+1];
        int k=0;
        int leng=arr.length;
        while(k<leng) {
            if(m==nums1.length){
                arr[k] = nums2[n];
                k++;
                n++;
            }
            else if(n==nums2.length){
                arr[k]=nums1[m];
                k++;
                m++;
            }
            else if(nums1[m]<=nums2[n]){
                arr[k]=nums1[m];
                k++;
                m++;
            }
            else{
                arr[k]=nums2[n];
                k++;
                n++;
            }
        }
        if (len%2==0) {
            return(arr[leng-1] + arr[leng-2])/2.0;
        }
        return arr[leng-1];
    }
} 

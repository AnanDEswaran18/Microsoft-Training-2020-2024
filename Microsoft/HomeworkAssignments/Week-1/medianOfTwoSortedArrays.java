class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int i=0,j=0;
        int len= nums1.length + nums2.length;
        int[] arr=new int[(len/2)+1];
        int k=0;
        int len1=arr.length;
        while(k<len1) {
            if(i==nums1.length){
                arr[k] = nums2[j];
                k++;
                j++;
            }
            else if(j==nums2.length){
                arr[k]=nums1[i];
                k++;
                i++;
            }
            else if(nums1[i]<=nums2[j]){
                arr[k]=nums1[i];
                k++;
                i++;
            }
            else{
                arr[k]=nums2[j];
                k++;
                j++;
            }
        }
        if (len%2==0) {
            return(arr[len1-1] + arr[len1-2])/2.0;
        }
        return arr[len1-1];
    }
}

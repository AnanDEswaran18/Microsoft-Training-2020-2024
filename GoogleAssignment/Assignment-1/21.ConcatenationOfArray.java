class Solution {
    public int[] getConcatenation(int[] nums) {
        int len = nums.length;
        int arr2[] = new int[2*len];
        for(int i=0;i<len;i++){
            arr2[i]=nums[i];
        }
        int j=len;
        for(int i=0;i<len;i++){
            arr2[j]=nums[i];
            j++;
        }
        return arr2;
    }
}

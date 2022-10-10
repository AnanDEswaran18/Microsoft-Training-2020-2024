class Solution {
    int[] nums;
    public TreeNode node(int f,int l){
        if(f>l){
            return null;
        }
        int m=(f+l)/2;
        TreeNode nn=new TreeNode(nums[m]);
        nn.left=node(f,m-1);
        nn.right=node(m+1,l);
        return nn;
    }
    public TreeNode sortedArrayToBST(int[] nums){
        this.nums=nums;
        return node(0,nums.length-1);
    }
}

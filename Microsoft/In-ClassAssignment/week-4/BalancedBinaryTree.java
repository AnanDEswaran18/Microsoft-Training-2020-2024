class Solution {
     public int ht(TreeNode root){
        if(root == null){
            return 0;
        }
        int ls= ht(root.left);
        int rs =ht(root.right);
        if(bd==true && Math.abs(ls-rs)>1){
            bd=false;
        }
        return Math.max(ls,rs) + 1;
    }
    boolean bd=true;
    public boolean isBalanced(TreeNode root) {
        if(root==null){
            return true;
        }
        ht(root);
        return bd;
    }
}

class Solution {
    public boolean isSymmetric(TreeNode root) {
        if(root==null){
            return true;
        }
        return st(root.left,root.right);
    }
    public boolean st(TreeNode left,TreeNode right){
        if(left == null && right == null){
            return true;
        }
        if(left == null || right == null){
            return false;
        }
        if(left.val!= right.val){
            return false;
        }
        return st(left.left,right.right) && st(left.right,right.left);
    }
}

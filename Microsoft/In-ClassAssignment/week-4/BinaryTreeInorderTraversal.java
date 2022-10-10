class Solution {
    List<Integer> r=new ArrayList<>();
    public List<Integer> inorderTraversal(TreeNode root) {
        //List<Integer> r=new ArrayList<>();
        intra(root);
        return r;
    }
     public void intra(TreeNode root){
        if(root==null){
            return;
        }
        intra(root.left);
        r.add(root.val);
        intra(root.right);
    }
}

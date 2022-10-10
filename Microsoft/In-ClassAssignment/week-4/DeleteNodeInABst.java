class Solution {
    public TreeNode deleteNode(TreeNode root, int key) {
        if(root==null){
            return root;
        }
        else if(root.val>key){
            root.left=deleteNode(root.left,key);
        }
        else if(root.val<key){
            root.right=deleteNode(root.right,key);
        }
        else{
            if(root.left==null){
                return root.right;
            }
            if(root.right==null){
                return root.left;
            }
            root.val=res(root.right);
            root.right=deleteNode(root.right,root.val);
        }
        return root;
    }
    public int res(TreeNode root){
        if(root==null){
            return -1;
        }
        if(root.left==null){
            return root.val;
        }
        return res(root.left);
    }
}

class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res=new ArrayList<>();
        if(root==null){
            return res;
        }
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            List<Integer> list=new ArrayList<>();
            int len=q.size();
            for(int i=0;i<len;i++){
                TreeNode tn=q.poll();
                list.add(tn.val);
                if(tn.left!=null){
                    q.add(tn.left);
                }
                if(tn.right!=null){
                    q.add(tn.right);
                }
            }
            res.add(list);
        }
        return res;
    }
}

class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> m=new HashMap();
        for(int n:nums){
            m.put(n,m.getOrDefault(n,0)+1);
        }
        Queue<Integer> q=new PriorityQueue<>((l1,l2)->m.get(l2)-m.get(l1));
        for(int nm:m.keySet()){
            q.add(nm);
        }
        int[] res=new int[k];
        for(int i=k-1;i>=0;--i){
            res[i]=q.poll();
        }
        return res;
    }
}

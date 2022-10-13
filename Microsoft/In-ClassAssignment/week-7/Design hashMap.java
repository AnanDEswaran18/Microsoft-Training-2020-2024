class MyHashMap {
    public class Node{
        int key,value;
        public Node(int key,int value){
            this.key=key;
            this.value=value;
        }
    }
    ArrayList<Node>[] arr;
    public MyHashMap() {
        arr=new ArrayList[100001];
    }
    public void put(int key, int value) {
        int ind=key/100;
        if(arr[ind]==null){
            arr[ind]=new ArrayList<Node>();
            arr[ind].add(new Node(key,value));
            return;
        }
        else{
            for(Node n:arr[ind]){
                if(n.key==key){
                    n.value=value;
                    return;
                }
            }
            arr[ind].add(new Node(key,value));
        }
    }
    
    public int get(int key) {
        int ind=key/100;
        if(arr[ind]==null){
            return -1;
        }
        for(Node e: arr[ind]){
            if(e.key==key){
                return e.value;
            }
        }
        return -1;
    }
    
    public void remove(int key) {
        int ind=key/100;
        if(arr[ind]==null){
            return;
        }
        for(Node n:arr[ind]){
            if(n.key==key){
                arr[ind].remove(n);
                return;
            }
        }
    }
}

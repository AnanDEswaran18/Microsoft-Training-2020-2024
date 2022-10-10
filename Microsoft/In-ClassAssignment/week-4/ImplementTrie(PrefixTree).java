class Trie {
    Node root;
    class Node{
        Node[] arr;
        boolean ep;
        public Node(){
            arr=new Node[26];
            ep=false;
        }
    }
    public Trie() {
        root=new Node();
    }
    
    public void insert(String word) {
        Node temp=root;
        int len=word.length();
        for(int i=0;i<len;i++){
            char cp=word.charAt(i);
            if(temp.arr[cp-'a']==null){
                temp.arr[cp-'a']=new Node();
            }
            temp=temp.arr[cp-'a'];
        }
        temp.ep=true;
    }
    
    public boolean search(String word) {
        Node temp=root;
        int len=word.length();
        for(int i=0;i<len;i++){
            char cp=word.charAt(i);
            if(temp.arr[cp-'a']==null){
                return false;
            }
            temp=temp.arr[cp-'a'];
        }
        return temp.ep==true;
    }
    
    public boolean startsWith(String prefix) {
        Node temp=root;
        int len1=prefix.length();
        for(int i=0;i<len1;i++){
            char cp=prefix.charAt(i);
            if(temp.arr[cp-'a']==null){
                return false;
            }
            temp=temp.arr[cp-'a'];
        }
        return true;
    }
}

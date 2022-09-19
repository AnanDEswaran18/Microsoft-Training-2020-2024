/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/
class Solution {
    public Node copyRandomList(Node head)
{
   Map<Node, Node> map = new HashMap<>();
   Node temp = head;
   while (temp != null)
   {
      map.put(temp, new Node(temp.val));
      temp = temp.next;
   }

   temp = head;
   Node dummy = new Node(0);
   Node prev = dummy;
   while (temp != null)
   {
      prev.next = map.get(temp);
      map.get(temp).random = map.get(temp.random);

      prev = prev.next;
      temp = temp.next;
   }

   return dummy.next;
}
}

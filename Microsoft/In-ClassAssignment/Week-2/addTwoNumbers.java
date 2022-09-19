class Solution {
  public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    ListNode dummy = new ListNode(0);
    ListNode temp = dummy;
    ListNode slow = l1;
    ListNode fast = l2;
    int carry = 0;
    int addition = 0;
    int addCarry = 0;
    while(slow != null || fast != null){
      if(fast == null){
        addCarry = slow.val + carry;
      }
      else if(slow == null){
        addCarry = fast.val + carry;
      }
      else{
        addCarry = slow.val + fast.val + carry;
      }
      if(addCarry >= 10){
        int num = addCarry % 10;
        temp.next = new ListNode(num);
        carry = addCarry/10;
      }
      else{
        temp.next = new ListNode(addCarry);
        carry = 0;
      }
      temp = temp.next;
      if(slow != null){
        slow = slow.next;
      }
      if(fast != null){
        fast = fast.next;
      }
    }
    if(carry > 0){
      temp.next = new ListNode(carry);
    }
    return dummy.next;
  }
}

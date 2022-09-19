/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */


struct ListNode* rotateRight(struct ListNode * head, int k ){
    int i=1, n=1 ;
 struct ListNode * current = head;
 struct ListNode * end = head;
 struct ListNode * temp=NULL;
    
    if (!head || k == 0) return head;
    
     while(end->next !=NULL){
        end=end->next;
         n++;
    }
    
    k = k%n;
    
    if(k==0) return head;
    
    k = n-k;
    while(i<k && current != NULL){
         current = current->next;
         
        i++;
    }
    temp=current->next;
    
    end->next = head;
    head= temp;
    current->next =NULL;
    
    return head;
    
}

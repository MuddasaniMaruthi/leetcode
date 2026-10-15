/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if (head == null || left == right)
            return head;

       ListNode t=head;
       for(int i=1;i<right;i++){
        t=t.next;
       }
       ListNode sh=t.next;
       t.next=null;
       
       ListNode temp=head;
       ListNode fprev=null;
       for(int i=1;i<left;i++){
        fprev=temp;
        temp=temp.next;
       }
       
      
       ListNode pres=temp;
       ListNode prev=null;
       while(pres!=null){
    ListNode curr=pres.next;
        pres.next=prev;
        prev=pres;
        pres=curr;
       }
     ListNode nh=prev;
     if(fprev!=null){
     fprev.next=nh;
     }
     else{
        head=prev;
     }
     temp.next=sh;
    
   
    
    return head;
    }

}
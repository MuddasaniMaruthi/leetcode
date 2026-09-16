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
    public ListNode mergeNodes(ListNode head) {
        ArrayList<Integer>list=new ArrayList<>();
        
        int sum=0;
       ListNode temp=head;
       while(temp!=null){
        if(temp.val==0){
            list.add(sum);
            sum=0;
        }
        else{
            sum+=temp.val;
        }
        temp=temp.next;
       }
        ListNode dummy=new ListNode(list.get(0));
        ListNode heads=dummy;
        for(int i=1;i<list.size();i++){
            heads.next=new ListNode(list.get(i));
            heads=heads.next;
        }
        return dummy.next;

        
    }
}
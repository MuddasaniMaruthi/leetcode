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
    public ListNode mergeKLists(ListNode[] lists) {
            PriorityQueue<Integer>queue=new PriorityQueue<>();
        for(int i=0;i<lists.length;i++){
            ListNode temp=lists[i];
            while(temp!=null){
                queue.add(temp.val);
                temp=temp.next;
            }
        }
        ListNode dummy=new ListNode(-1);
        ListNode node=dummy;
        while(!queue.isEmpty()){
            node.next=new ListNode(queue.poll());
            node=node.next;
        }
        return dummy.next;
    }
}
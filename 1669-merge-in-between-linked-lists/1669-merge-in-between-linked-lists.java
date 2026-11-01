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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode temp=list1;
        for(int i=1;i<=b;i++){
            temp=temp.next;
        }
        ListNode sh=temp.next;
        ListNode t=list1;
        for(int i=1;i<a;i++){
            t=t.next;
        }
        t.next=list2;
        ListNode t1=list2;
        while(t1.next!=null){
            t1=t1.next;
        }
        t1.next=sh;
        return list1;

    }
}
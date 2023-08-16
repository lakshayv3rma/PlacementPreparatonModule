class Solution {
    public ListNode reverseList(ListNode head) {
       ListNode nh=reverse(head);
       return nh;
    }
    public ListNode reverse(ListNode head){
        if(head==null || head.next==null) return head;
        ListNode nh=reverse(head.next);
        head.next.next=head;
        head.next=null;
        return nh;
    }
}

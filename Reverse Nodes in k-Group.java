class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode prehead=new ListNode(-1);
        prehead.next=head;
        ListNode begin=prehead;
        int i=0;
        while(head!=null){
            i++;
            if(i%k==0){
                begin=reverse(begin,head.next);
                head=begin.next;
            }
            else
            head=head.next;
        }
        return prehead.next;
    }
    public ListNode reverse(ListNode start,ListNode end){
        ListNode curr=start.next,pre=start,c,first=curr;
        while(curr!=end){
           c=curr.next;
           curr.next=pre;
           pre=curr;
           curr=c;
        }
        start.next=pre;
        first.next=curr;
        return first;
    }
}

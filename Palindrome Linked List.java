class Solution {
    public boolean isPalindrome(ListNode head) {
      ListNode p1=head,p2=head,curr,prev=null;
      while(p2!=null && p2.next!=null)
      {
        p1=p1.next;
        p2=p2.next.next;
      }
       
      while(p1!=null)
      {
        curr=p1.next;
        p1.next=prev;
        prev=p1;
        p1=curr;
      }
      ListNode itr=head;
      while(itr.next!=null)
      {
        if(itr.val!=prev.val)
          return false;
        itr=itr.next;
        prev=prev.next;
      }
      return true;
    }
}

class Solution {
    public ListNode rotateRight(ListNode head, int k) {
      if(head==null || head.next==null)
        return head;
      int length=1;
      ListNode curr=head;
      while(curr.next!=null)
      {
        length++;
        curr=curr.next;
      } 
      curr.next=head;
      k=k%length;
      curr=head;
      for(int i=0;i<length-k-1;i++)
      {
        curr=curr.next;
      }
      head=curr.next;
      curr.next=null;
      return head;
    }
}

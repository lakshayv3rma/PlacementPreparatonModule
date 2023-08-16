public class Solution {
    public boolean hasCycle(ListNode head) {
      ListNode curr1=head;
      ListNode curr2=new ListNode(0);
      curr2.next=head;
      while(curr1!=curr2)
      {
         if(curr1==null||curr1.next==null)
          return false;
        curr1=curr1.next.next;
        curr2=curr2.next;
        
      }
      return true;
    }
}

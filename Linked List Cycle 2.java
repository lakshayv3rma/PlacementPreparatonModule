public class Solution {
    public ListNode detectCycle(ListNode head) {
       ListNode fast =head;
       ListNode slow =head;
      do
      {
        if(fast==null || fast.next==null)
          return null;
        fast=fast.next.next;
        slow=slow.next;
      }while(slow!=fast);
      
       fast = head;
        
        while(slow!=fast){
            slow = slow.next;
            fast = fast.next;
        }
      return slow;
    }
}

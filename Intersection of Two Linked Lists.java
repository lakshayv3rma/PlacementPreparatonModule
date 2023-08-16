public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
      ListNode currA=headA,currB=headB;
      int sizeA=0,sizeB=0;
      while(currA!=null)
      {
        currA=currA.next;
        sizeA++;
      } 
      while(currB!=null)
      {
        currB=currB.next;
        sizeB++;
      }
      currA=headA;currB=headB;
      int diff=sizeA-sizeB;
      if(diff<0)
      {
        while(diff<0)
        {
          diff++;
          currB=currB.next;
        }
      }
      else
      {
        while(diff>0)
        {
          diff--;
          currA=currA.next;
        }
      }
      while(currA!=null && currB!=null)
      {
        if(currA==currB)
          return currA;
        currA=currA.next;
        currB=currB.next;
      }
      return null;
    }
}

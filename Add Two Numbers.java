class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
ListNode dummy_head=new ListNode(0);
      ListNode l3=dummy_head;int carry=0;
      
      while(l1!=null || l2!=null)
      {
        int sum=0;
        if(l1!=null){sum=sum+l1.val;l1=l1.next;}
        if(l2!=null){sum=sum+l2.val;l2=l2.next;}
        sum=sum+carry;
        carry=sum/10;
        ListNode currsum=new ListNode(sum%10);
        l3.next=currsum;
        
        l3=l3.next;
      }
      if(carry>0)
      {
        ListNode node=new ListNode(carry);
        l3.next=node;
      }
      return dummy_head.next;
    }
}

class Solution {
    public ListNode mergeKLists(ListNode[] lists) {

        if(lists.length==0) return null;
        if(lists.length==1)return lists[0];
        ListNode head=merge(lists[0],lists[1]);
        for(int i=2;i<lists.length;i++){
            head=merge(head,lists[i]);
        }
        return head;
    }
    public ListNode merge(ListNode l1,ListNode l2){
        ListNode head=new ListNode();
        if(l1==null)return l2;
        if(l2==null)return l1;
        if(l1.val<l2.val){
            head.val=l1.val;
            l1=l1.next;
        }
        else{
            head.val=l2.val;
            l2=l2.next;
        }
        ListNode l3=head;
        while(l1!=null && l2!= null){
            l3.next=new ListNode();
            l3=l3.next;
            if(l1.val<l2.val){
                l3.val=l1.val;
                l1=l1.next;
            }
            else{
                l3.val=l2.val;
                l2=l2.next;
            }
        }
        while(l1!=null){
            l3.next=new ListNode();
            l3=l3.next;
            l3.val=l1.val;
            l1=l1.next;
        }
        while(l2!=null){
            l3.next=new ListNode();
            l3=l3.next;
            l3.val=l2.val;
            l2=l2.next;
        }
        return head;
    }
}

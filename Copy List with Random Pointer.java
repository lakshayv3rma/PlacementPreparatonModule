/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
      HashMap<Node,Node> map =new HashMap<>();
      Node nHead =new Node(-1); 
     Node curr=head,copy=nHead;
     while(curr!=null)
     {
       Node node =new Node(curr.val);
       copy.next =node;
       map.put(curr,node);
       copy=copy.next;
       curr=curr.next;
     }
      nHead=nHead.next;
      curr=head;
      Node c1=nHead;
      while(curr!=null)
      {
        if(curr.random!=null)
        c1.random=map.get(curr.random);
        else
        c1.random=null;  
        c1=c1.next;
        curr=curr.next;
      }
      return nHead;
    }
}

class Solution {
    public Node flatten(Node head) {
        if (head == null) return null;
        flattentail(head);
        return head;
    }
    
    private Node flattentail(Node cur) {
        if (cur.child != null) {
            Node tail = flattentail(cur.child);
            tail.next = cur.next;
            if (cur.next != null) cur.next.prev = tail;
            cur.next = cur.child;
            cur.child.prev = cur;
            cur.child = null;
            if (tail.next == null) return tail;
            return flattentail(tail.next);
        }
        if (cur.next == null) {
            return cur;
        }
        return flattentail(cur.next);
    }
}

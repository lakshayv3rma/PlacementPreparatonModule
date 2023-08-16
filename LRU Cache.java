class LRUCache {
      class DLinked{
          int key,value;
          DLinked pre,post;
      }
      private void addNode(DLinked node){
          node.pre=head;
          node.post=head.post;
          head.post.pre=node;
          head.post=node;
      }

      private void remove(DLinked node){
          DLinked pre=node.pre,post=node.post;
          pre.post=post;
          post.pre=pre;
      }

      private void moveToHead(DLinked node){
          this.remove(node);
          this.addNode(node);
      }
     
      private DLinked popTail(){
          DLinked res=tail.pre;
          this.remove(res);
          return res;
      }

      private Map<Integer,DLinked> lru=new HashMap<>();
      private int count,cap;
      private DLinked head,tail;

    public LRUCache(int capacity) {
        cap=capacity;                 //cap=2 k=1
        count=0;

        head=new DLinked();
        head.pre=null;
        tail=new DLinked();
        tail.post=null;

        head.post=tail;
        tail.pre=head;
    }
    
    public int get(int key) {
        DLinked node=lru.get(key);
        if(node==null) return -1;
        this.moveToHead(node);
        return node.value;
    }
    
    public void put(int key, int value) {
       DLinked node=lru.get(key);

       if(node==null){
           DLinked next=new DLinked();
           next.key=key;
           next.value=value;

           lru.put(key,next);
           this.addNode(next);
           count++;

           if(count>cap){
               DLinked tail=this.popTail();
               lru.remove(tail.key);
               count--;
           }
       }
       else{
           node.value=value;
           moveToHead(node);
           
       }
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */

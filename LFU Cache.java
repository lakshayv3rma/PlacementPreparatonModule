class LFUCache {
    HashMap<Integer,Integer> val; // Stores <Key,Value>
    HashMap<Integer,Integer> freq;  // Stores <Key,Frequency>
    HashMap<Integer,LinkedHashSet<Integer>> lru; // Stores <Frequency,<Keys>>
    int cap;
    int min=-1;   
    public LFUCache(int capacity) {
        val=new HashMap<>();
        freq=new HashMap<>();
        lru=new HashMap<>();
        lru.put(1,new LinkedHashSet<>());
        cap=capacity;
    }
    
    public int get(int key) {
        if(!val.containsKey(key)) return -1;
        int count= freq.get(key);
        freq.put(key,count+1);
        lru.get(count).remove(key);
        if(count==min && lru.get(count).size()==0)
        min++;

        if(!lru.containsKey(count+1))
        lru.put(count+1,new LinkedHashSet<>());

        lru.get(count+1).add(key);
        return val.get(key); 
    }
    
    public void put(int key, int value) {
        if(cap<=0) return;
        if(val.containsKey(key)){
            val.put(key,value);
            get(key);
            return;
        }
        if(val.size()>=cap){
            int evict=lru.get(min).iterator().next();
            lru.get(min).remove(evict);
            val.remove(evict);
            freq.remove(evict);
        }
        val.put(key,value);
        freq.put(key,1);
        min=1;
        lru.get(1).add(key);
    }
}

/**
 * Your LFUCache object will be instantiated and called as such:
 * LFUCache obj = new LFUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */

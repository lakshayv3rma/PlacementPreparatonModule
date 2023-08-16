class MedianFinder {
     Queue<Integer> max=new PriorityQueue<>(Collections.reverseOrder());
     Queue<Integer> min =new PriorityQueue<>();
     boolean even=true;
    public MedianFinder() {
        
    }
    
    public void addNum(int num) {
        if(even){
            min.offer(num);
            max.offer(min.poll());
        }
        else{
            max.offer(num);
            min.offer(max.poll());
        }
       even=!even;
    }
    
    public double findMedian() {
        if(even)
       return (max.peek()+min.peek())/2.0;
      return max.peek();
    }
}

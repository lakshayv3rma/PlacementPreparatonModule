class Pair{
  int x,y;
  Pair(int a,int b){
    x=a;y=b;
  }
}

class StockSpanner {
   List<Pair> span;
    public StockSpanner() {
       span=new ArrayList<>();
    }
    
    public int next(int price) {
      int ans=1;
      for(int i=span.size()-1;i>=0;){
        if(span.get(i).x<=price)
        {
          int k=span.get(i).y;
          ans+=k;
          i-=k;
        }
        else
          break;
      }
      span.add(new Pair(price,ans));
      return ans;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */

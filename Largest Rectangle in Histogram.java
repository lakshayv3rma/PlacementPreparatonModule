class Solution {
    public int largestRectangleArea(int[] height) {
      int n=height.length;
      int leftsmaller[]=new int[n];
      int rightsmaller[]=new int[n];
      Stack <Integer> st=new Stack<>();
      for(int i=0;i<n;i++)
      {
        while(!st.isEmpty() && height[st.peek()]>=height[i])
          st.pop();
        if(st.isEmpty())leftsmaller[i]=0;
        else
          leftsmaller[i]=st.peek()+1;
        st.push(i);
      }
      
      while(!st.isEmpty())
        st.pop();
      
      for(int i=n-1;i>=0;i--)
      {
        while(!st.isEmpty() && height[st.peek()]>=height[i])
          st.pop();
        if(st.isEmpty())rightsmaller[i]=n-1;
        else
          rightsmaller[i]=st.peek()-1;
        st.push(i);
      }
      
      int area=0,max=0;
      for(int i=0;i<n;i++)
      {
        area=(rightsmaller[i]-leftsmaller[i]+1)*height[i];
        max=Math.max(area,max);
      }
      return max;
    }
}

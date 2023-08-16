class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
       Deque<Integer> dq=new ArrayDeque<>();
       int ans[]=new int[nums.length-k+1];
       for(int i=0;i<k;i++){
           while(!dq.isEmpty() && nums[dq.peekLast()]<=nums[i])
           dq.removeLast();
           dq.add(i);
       }
       ans[0]=nums[dq.peekFirst()];
       int ind=1;
       for(int i=k;i<nums.length;i++){
           if(!dq.isEmpty() && dq.peekFirst()<=i-k)
           dq.removeFirst();
            while(!dq.isEmpty() && nums[dq.peekLast()]<=nums[i])
           dq.removeLast();
           dq.addLast(i);
           ans[ind++]=nums[dq.peekFirst()];
       }  
        return ans;
    }
}

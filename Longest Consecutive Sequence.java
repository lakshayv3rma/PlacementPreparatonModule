class Solution {
    public int longestConsecutive(int[] nums) {
        HashMap<Integer,Integer> streak=new HashMap<Integer,Integer>();
        int max=0;

        for(int i=0;i<nums.length;i++){
            int x=nums[i];
            if(!streak.containsKey(x)){
            int lb=streak.getOrDefault(x-1,0);
            int rb=streak.getOrDefault(x+1,0);
            int str=lb+rb+1;
            streak.put(x-lb,str);
            streak.put(x+rb,str);
            if(lb!=0 && rb!=0) streak.put(x,0);
            
            max=Math.max(max,str);
            }
        }
        
        
        return max;
    }
}

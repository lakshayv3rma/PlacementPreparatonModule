class Solution {
    public int maxSubArray(int[] nums) {
        int max=Integer.MIN_VALUE,currmax=0;
        for(int i=0;i<nums.length;i++){
            currmax+=nums[i];
            max=Math.max(max,currmax);
            if(currmax<0)currmax=0;
        }
        return max;
    }
}

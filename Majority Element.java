class Solution {
    public int majorityElement(int[] nums) {
      if(nums.length==1)
        return nums[0];
      Arrays.sort(nums);
      int n=nums.length,c=1;
      for(int i=0;i<n-1;i++)
      {
        if(nums[i+1]==nums[i])
        {
          c++;
          if(c>(n/2))
            return nums[i];
        }
        else
          c=1;
      }
      return 0;
    }
}

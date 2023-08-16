class Solution {
  
  public List<List<Integer>> twoSum(int[] nums, int target,int start,int end)
  {
    List<List<Integer>> res =new ArrayList<>();
    int left=start,right=end;
    while(left<right)
    {
      if(left!=start && nums[left]==nums[left-1])
      {
        left++;continue;
      }
      int sum=nums[left]+nums[right];
      if(sum==target)
      {
        List<Integer> sub =new ArrayList<>();
        sub.add(nums[left]);
        sub.add(nums[right]);
        res.add(sub);
        left++;right--;
      }
      else if(sum<target)
      {
        left++;
      }
      else
      {
        right--;
      }
    }
    return res;
  }
  
  public List<List<Integer>> threeSum(int[] nums, int target,int start){
    
    List<List<Integer>> res =new ArrayList<>();
    int n=nums.length;
    for(int i=start;i<n-2;i++)
    {
      if(i!=start && nums[i]==nums[i-1])
        continue;
      
      int val=nums[i];int tar=target-val;
      
      List<List<Integer>> sub = twoSum(nums,tar,i+1,n-1);
      
      for(List<Integer> list: sub)
      {
        list.add(nums[i]);
        res.add(list);
      }
    }
    return res;
  }
   
    public List<List<Integer>> fourSum(int[] nums, int target) {
       
      List<List<Integer>> res =new ArrayList<>();
      int n= nums.length;
      if(n<4) return res;
      Arrays.sort(nums);
      for(int i=0;i<n-3;i++)
      {
        if(i!=0 && nums[i]==nums[i-1])
          continue;
        int val=nums[i];
        int targ=target-val;
        
        List<List<Integer>> sub =threeSum(nums,targ,i+1);
        
        for(List<Integer> list: sub)
        {
          list.add(nums[i]);
          res.add(list);
        }
      }
      return res;
    }
}

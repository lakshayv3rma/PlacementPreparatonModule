class Solution {
  
  public List<List<Integer>> twoSum(int [] arr,int start,int end,int target)
  {
    List<List<Integer>> res =new ArrayList<>();
    int left=start,right=end;
    while(left<right)
    {
      if(left!=start && arr[left]==arr[left-1])
      {
        left++;continue;
      }
      int sum=arr[left]+arr[right];
      if(sum==target)
      {
        List<Integer> sub =new ArrayList<>();
        sub.add(arr[left]);
        sub.add(arr[right]);
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
  
    public List<List<Integer>> threeSum(int[] nums) {
      List<List<Integer>> list =new ArrayList<>();
      if(nums.length<3)
        return list;
      Arrays.sort(nums);
      for(int i=0;i<nums.length-2;i++)
      {
        if(i!=0 && nums[i]==nums[i-1])
          continue;
        
        int target=-nums[i];
        List<List<Integer>> res = twoSum(nums,i+1,nums.length-1,target);
        
        for(List<Integer> list1 : res)
        {
          list1.add(nums[i]);
          list.add(list1);
        }
      }
      return list;
    }
}

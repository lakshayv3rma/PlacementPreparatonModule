class Solution {
    public int singleNonDuplicate(int[] nums) {
        int l=0,h=nums.length-1;
      while(l<=h){
        int mid=(l+h)/2;
        if(mid%2==0){
          if(mid<nums.length-1 && nums[mid+1]==nums[mid]){
            l=mid+1;
          }
          else if(mid>0 && nums[mid-1]==nums[mid]){
            h=mid-1;
          }
          else
            return nums[mid];
        }
        else{
          if(nums[mid-1]==nums[mid]){
            l=mid+1;
          }
          else if(mid<nums.length-1 && nums[mid+1]==nums[mid])
            h=mid-1;
          else
            return nums[mid];
        }
      }
      return nums[l];
    }
}

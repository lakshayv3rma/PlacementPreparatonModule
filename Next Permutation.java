class Solution {
    public void nextPermutation(int[] nums) {
        int n=nums.length,ind=-1;
        boolean flag=false;
        for(int i=n-1;i>0;i--){
            if(nums[i]> nums[i-1]){
              flag=true;
         ab:  for(int j=n-1;j>i;j--){
                  if(nums[j]>nums[i-1]){
                      ind=j;
                      break ab;
                  }
              }
              if(ind==-1) ind=i;
              int temp=nums[i-1];
              nums[i-1]=nums[ind];
              nums[ind]=temp;
              Arrays.sort(nums,i,n);
              break;
            }
        }
        if(!flag) Arrays.sort(nums);
    } 
}

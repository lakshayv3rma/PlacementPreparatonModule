class Solution {
    public void sortColors(int[] nums) {
        int one=0,zero=0,two=0;
        for(int i:nums){
            if(i==0)zero++;
            else if(i==1) one++;
            else
            two++;
        }
        for(int i=0;i<zero;i++)
        nums[i]=0;
        for(int i=zero;i<zero+one;i++)
        nums[i]=1;
        for(int i=zero+one;i<nums.length;i++)
        nums[i]=2;
    }
}

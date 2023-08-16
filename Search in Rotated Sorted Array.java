class Solution {
    public int search(int[] nums, int target) {
        int l=0,h=nums.length-1,n=h+1;
        while(l<=h){
            int m=(l+h)/2;
            if(nums[m]==target) return m;
            if(nums[m]<=nums[n-1]){
                h=m-1;
            }
             else{
                 l=m+1;
             }
        }
        
        int rot=l;l=0;h=n-1;
        while(l<=h){
            int mid=(l+h)/2;
            int rmid=(rot+mid)%n;
            if(nums[rmid]==target) return rmid;
            else if(nums[rmid]<target) l=mid+1;
            else h=mid-1;
        }
        return -1;
    }
}

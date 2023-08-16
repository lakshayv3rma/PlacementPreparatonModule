class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res=new ArrayList<>();
       
        gen(res,0,nums);
        return res;
    }
    public void gen(List<List<Integer>> res,int ind,int[] nums){
        if(ind==nums.length-1){
            List<Integer> curr=new ArrayList<>();
            for(int i=0;i<nums.length;i++){
                curr.add(nums[i]);
               
            }
           
            res.add(new ArrayList<>(curr));
            return;
        }
        for(int i=ind;i<nums.length;i++){
            int temp=nums[i];
            nums[i]=nums[ind];
            nums[ind]=temp;
            gen(res,ind+1,nums);
            temp=nums[i];
            nums[i]=nums[ind];
            nums[ind]=temp;
        }  
    }
}

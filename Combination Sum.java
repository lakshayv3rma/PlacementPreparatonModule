class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans=new ArrayList<>();
        solve(candidates,target,ans,new ArrayList<Integer>(),0);
        return ans;
    }
    public void solve(int[] can,int t,List<List<Integer>> ans,List<Integer> li,int index){
       if(index==can.length) return;
        if(t==0) {
            ans.add(new ArrayList<>(li));
            return;
        }
          if(t>=can[index]){ 
          li.add(can[index]);
            solve(can,t-can[index],ans,li,index);
            li.remove(li.size()-1);
             solve(can,t,ans,li,index+1);
    }
    else
    solve(can,t,ans,li,index+1);
    }
}

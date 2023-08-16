class Solution {
    public List<List<Integer>> generate(int n) {
        List<List<Integer>> ans=new ArrayList<>();
        for(int i=0;i<n;i++)
        ans.add(new ArrayList<Integer>());
        ans.get(0).add(1);
        int col=2;   
        for(int i=1;i<n;i++){
            for(int j=0;j<col;j++){
                if(j==0 || j==col-1)
                ans.get(i).add(1);
                else{
                 ans.get(i).add(ans.get(i-1).get(j)+ans.get(i-1).get(j-1));
                }
            }
            col++;
        }
        return ans;  
    }
}

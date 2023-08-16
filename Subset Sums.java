//User function Template for Java//User function Template for Java
class Solution{
    ArrayList<Integer> subsetSums(ArrayList<Integer> arr, int N){
        // code here
        ArrayList<Integer> res=new ArrayList<Integer>();
        solve(arr,res,0,0);
        return res;
    }
    private static void solve(List<Integer> arr, List<Integer> res,int i,int sum){
        if(i==arr.size()){
            res.add(sum);
            return;
        }
        int k=arr.get(i);
     
        solve(arr,res,i+1,sum+k);
  
        solve(arr,res,i+1,sum);
    }
}

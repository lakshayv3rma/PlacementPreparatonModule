class GfG
{
    int maxLen(int arr[], int n)
    {
        // Your code here
        HashMap<Integer,Integer> sum=new HashMap<>();
        sum.put(0,-1);
        int curr=0,max=0;
        for(int i=0;i<n;i++){
            curr+=arr[i];
            if(sum.containsKey(curr)){
                max=Math.max(max,i-sum.get(curr));
            }
            else 
            sum.put(curr,i);
        }
        return max;
        
    }
}

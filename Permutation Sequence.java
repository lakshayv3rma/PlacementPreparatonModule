class Solution {
    public String getPermutation(int n, int k) {
        int fact[]=new int[n+1];
        fact[0]=1;
        for(int i=1;i<=n;i++)
        fact[i]=fact[i-1]*i;

        List<Integer> num=new ArrayList<>();
        for(int i=1;i<=n;i++)
        num.add(i);

        StringBuilder ans=new StringBuilder(); 
        k--;     
        for(int i=1;i<=n;i++){
            int ind=k/fact[n-i];
            ans.append(String.valueOf(num.get(ind)));
            num.remove(ind);
            k-=ind*fact[n-i];
        }
        return String.valueOf(ans);
    }
}

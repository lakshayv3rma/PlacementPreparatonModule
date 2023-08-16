class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        HashSet<String> set=new HashSet<>();
        int max=0,n=s.length();
        for(String k:wordDict){
            set.add(k);
            max=Math.max(max,k.length());
        }
        boolean dp[]=new boolean[n+1];
        dp[0]=true;

        for(int i=1;i<=n;i++){
            for(int j=i-1;j>=Math.max(i-max-1,0);j--){
                if(set.contains(s.substring(j,i)) && dp[j]){
                    dp[i]=true;
                    break;
                }
            }
        }
        return dp[n];
    }
}

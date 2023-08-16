class Solution {
    public int coinChange(int[] coins, int amount) {
        long ans[]=new long[amount+1];
        Arrays.fill(ans,-1);
        long k= mincoin(coins,amount,ans);
        return k<Integer.MAX_VALUE?(int)k:-1;
    }
    public long mincoin(int[]coins,int amount,long[] ans){
        if(amount<0) return Integer.MAX_VALUE;
        if(amount==0) return 0;
        if(ans[amount]!=-1) return ans[amount];
        ans[amount]=Integer.MAX_VALUE;
        for(int i=0;i<coins.length;i++){
            ans[amount]=Math.min(ans[amount],1+mincoin(coins,amount-coins[i],ans));
        }
        return ans[amount];
    }
}

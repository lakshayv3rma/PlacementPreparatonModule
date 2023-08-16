class Solution {
    public int maxProfit(int[] prices) {
        int buy=Integer.MAX_VALUE,max=0;
        for(int i=0;i<prices.length;i++){
            buy=Math.min(buy,prices[i]);
            max=Math.max(max,prices[i]-buy); 
        }
        return max;
    }
}

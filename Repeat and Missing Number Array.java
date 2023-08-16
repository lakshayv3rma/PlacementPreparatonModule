public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int[] repeatedNumber(final int[] A) {
        int slow=A[0]-1,fast=A[0]-1;
        do{
            slow=A[slow-1];
            fast=A[A[fast-1]-1];
        }while(slow!=fast);
        slow=A[0]-1;
        while(slow!=fast){
            slow=A[slow-1];
            fast=A[fast-1];
        }
        int ans[]=new int[2];
        ans[0]=slow+1;
        int res=A.length*(A.length+1)/2;
        int sum=0;
        for(int i=0;i<A.length;i++)
        sum+=A[i];
        sum-=slow+1;
        ans[1]=res-sum;
        return ans;
    }
}

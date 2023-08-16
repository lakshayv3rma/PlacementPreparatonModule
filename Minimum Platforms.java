

//User function Template for Java

class Solution
{
    //Function to find the minimum number of platforms required at the
    //railway station such that no train waits.
    static int findPlatform(int arr[], int dep[], int n)
    {
       int time[]=new int[2401];
       for(int i=0;i<n;i++){
           time[arr[i]]++;
           time[dep[i]+1]--;    
       }
       int max=time[0];
       for(int i=1;i<2401;i++){
           time[i]+=time[i-1];
           max=Math.max(max,time[i]);
       }
       return max;
    }
    
}

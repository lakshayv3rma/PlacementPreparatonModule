

class Solution 
{
    //Function to find the maximum number of meetings that can
    //be performed in a meeting room.
    public static int maxMeetings(int start[], int end[], int n)
    {
        // add your code here
        int time[][]=new int[n][2];
        for(int i=0;i<n;i++){
            time[i][0]=start[i];
            time[i][1]=end[i];
        }
        Arrays.sort(time,((a,b)->a[1]-b[1]));
        int curr=time[0][1],max=1;
       for(int i=1;i<n;i++){
           if(time[i][0]>curr){
               max++;
               curr=time[i][1];
           }
       }
        return max;
    }
}



class Solution
{
    //Function to find the maximum profit and the number of jobs done.
    int[] JobScheduling(Job arr[], int n)
    {
        // Your code here
        Arrays.sort(arr,new sortbyP());
     
        int[] ans=new int[n];
        int prof=0,job=0;
        for(int i=0;i<n;i++){
            for(int j=Math.min(n-1,arr[i].deadline-1);j>=0;j--){
                if(ans[j]==0){
                    ans[j]=arr[i].profit;
                    prof+=ans[j];
                    job++;
                    break;
                }
            }
        }
        int res[]=new int[2];
        res[0]=job;res[1]=prof;
        return res;
    }
}

class sortbyP implements Comparator<Job>{
    public int compare(Job a,Job b){
        return b.profit-a.profit;
    }
}

/*
class Job {
    int id, profit, deadline;
    Job(int x, int y, int z){
        this.id = x;
        this.deadline = y;
        this.profit = z; 
    }
}
*/

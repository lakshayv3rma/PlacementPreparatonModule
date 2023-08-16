import java.util.* ;
import java.io.*; 
public class Solution {
    static long ans=0;
    static long A[];
    public static long getInversions(long arr[], int n) {
        // Write your code here.
        A=new long[n];
        mergesort(arr,0,n-1);
        //System.out.println("Answer= "+ans);
        return ans;
    }
    public static void mergesort(long arr[],int low,int high){
        if(low<high){
            int mid=(low+high)/2;
            mergesort(arr,low,mid);
            mergesort(arr,mid+1,high);
            merge(arr,low,mid,high);
        }
    }
    public static void merge(long arr[],int low,int mid,int high){
        int i=low,j=mid+1,k=0;
        while(i<=mid && j<=high){
          if(arr[i]<arr[j]){
              A[k++]=arr[i++];
          }
          else{
              ans+=mid-i+1;
              A[k++]=arr[j++];
          } 
        }
        while(i<=mid)
        A[k++]=arr[i++];
        while(j<=high)
        A[k++]=arr[j++];
        for(i=low;i<=high;i++ ){
            arr[i]=A[i-low];
        }
    }
}

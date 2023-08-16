static long  maxN = (long)1e10; // the maximum value in the array possible.
 
static int upperBound(int[] a, int low,
                      int high, long element)
{
    while(low < high){
        int middle = low + (high - low)/2;
        if(a[middle] > element)
            high = middle;
        else
            low = middle + 1;
    }
    return low;
}
 
static long  kthElement(int arr1[], int arr2[], int n,
                         int m, int k)
{
    long  left = 1, right = maxN;
    long  ans = (long)1e15; 
 
   
    while (left <= right) {
        long  mid = (left + right) / 2;
        long  up_cnt = upperBound(arr1,0, n, mid);
        up_cnt += upperBound(arr2, 0, m, mid);
 
        if (up_cnt >= k) {
            ans = Math.min(ans,
                      mid); 
            right
                = mid - 1; 
        }
        else
            left = mid + 1; 
    }
 
    return ans;
}

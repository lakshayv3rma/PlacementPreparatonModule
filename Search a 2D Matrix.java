class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
     int low=0,col=matrix[0].length,high;
      high=matrix.length*col-1;
      while(low<=high){
        int mid=(low+high)/2;
        if(matrix[mid/col][mid%col]==target)
          return true;
        else if(matrix[mid/col][mid%col]>target)
          high=mid-1;
        else
          low=mid+1;
      }
      return false;
    }
}

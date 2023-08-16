class Solution {
  
    public String longestPalindrome(String s) {
      int n=s.length();
      boolean isPal[][]=new boolean[n][n];
      for(int i=0;i<n;i++)
      Arrays.fill(isPal[i],true);
      int left=0,right=0,len=1;
      for(int d=1;d<n;d++){
          int i=0,j=d;
          while(i<n && j<n){
              isPal[i][j]=(s.charAt(i)==s.charAt(j)) && isPal[i+1][j-1];
              if(isPal[i][j] && len<j-i+1)
              {
                 len=j-i+1;
                 left=i;right=j;
              }
              i++;j++;
          }
      }
      return s.substring(left,right+1); 
  }
}

class Solution {
    public void rotate(int[][] mat) {
        if(mat.length==1) return;
        int n=mat.length;
        int c1=0,r1=0,r2=0,c2=n-1,r3=n-1,c3=n-1,r4=n-1,c4=0,k=1;
        while(r1<n-1){
            
           while(c1<n-k){
              int temp=mat[r1][c1];
              mat[r1][c1]=mat[r4][c4];
              int temp2=mat[r2][c2];
              mat[r2][c2]=temp;
              temp=mat[r3][c3];
              mat[r3][c3]=temp2;
              mat[r4][c4]=temp;
              c1++;r2++;c3--;r4--;
           }
           k++;
           r1++;c1=r1;
           c2--;r2=n-c2-1;
           r3--;c3=r3;
           c4++;r4=n-c4-1; 
        }
    }
}

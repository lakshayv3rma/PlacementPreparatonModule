class Solution {
    public double myPow(double x, int n) {
        long j=n;
        return pow(x,j);
    }
    public double pow(double x,long n){
         if(n<0)
        return 1/pow(x,n*-1);
        if(n==0) return 1;
        if(n%2==0){
            double k= pow(x,n/2);
            return k*k;
        }
    
            double k=pow(x,n-1);
            return x*k;
        
    }
}

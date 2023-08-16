class Solution {
    public int romanToInt(String s) {
        int n=0,ans=0,prev=0;
        for(int i=s.length()-1;i>=0;i--){
            switch(s.charAt(i)){
                case 'M': n=1000;break;
                case 'D': n=500;break;
                case 'C': n=100;break;
                case 'L': n=50;break;
                case 'X': n=10;break;
                case 'V': n=5;break;
                case 'I': n=1;break;
            }
            if(n<prev)
            ans-=n;
            else
            ans+=n;
            prev=n;
        }
        return ans;
    }
}

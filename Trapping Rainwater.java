class Solution {
    public int trap(int[] height) {
        int smaller=0;
        
        int area=0;
        int l=0;
        for(int i=1;i<height.length;i++){
            
            if(height[smaller]<=height[i]){
                area+=height[smaller]*(i-smaller-1)-l;
                smaller=i;
                l=0;
            }
            else{
                l+=height[i];
            }
        }
       
        int n=height.length;
        smaller=n-1;
        l=0;
        for(int i=n-2;i>=0;i--){
             if(height[smaller]<height[i]){
                area+=height[smaller]*(smaller-i-1)-l;
               
                smaller=i;
                l=0;
            }
            else{
                l+=height[i];
            }
        }
        return area;
    }
}

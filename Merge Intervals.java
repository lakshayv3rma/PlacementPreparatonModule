class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->(a[0]-b[0]));
        List<int[]> res=new ArrayList<>();
        int start=0,end=0;
        for(int i=0;i<intervals.length;i++){
            start=intervals[i][0];
            end=intervals[i][1];
            while(i<intervals.length-1 && end>=intervals[i+1][0]){
                end=Math.max(intervals[i+1][1],end);
                i++;
            }
            res.add(new int[]{start,end}); 
        }
        int ans[][]=new int[res.size()][2];
        for(int i=0;i<res.size();i++){
            ans[i]=res.get(i);
            
        }
        return ans;
    }
}

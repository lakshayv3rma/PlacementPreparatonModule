class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length()==0) return 0;
        int st=0,e=1,max=1,len=1;
        HashSet<Character> map=new HashSet<Character>();
        map.add(s.charAt(0));
        while(st<=e && e<s.length()){
            if(!map.contains(s.charAt(e))){
                map.add(s.charAt(e));
                len++;
                max=Math.max(max,len);
                e++;
            }
            else{
                map.remove(s.charAt(st));
                len--;
                st++;
            }
        }
        return max;
    }
}

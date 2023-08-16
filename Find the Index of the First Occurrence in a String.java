class Solution {
    public int strStr(String haystack, String needle) {
      int l1=haystack.length(),l2=needle.length(); 
      if(l2>l1) return -1;
      if(l2==0) return 0;
      ArrayList<Integer> list=new ArrayList<>();
      for(int i=0;i<haystack.length();i++)
      {
        if(haystack.charAt(i)==needle.charAt(0))
          list.add(i);
      }
      for(Integer i:list)
      {
        if((i+l2)>l1) return -1;
        if((haystack.substring(i,i+l2)).equals(needle))
          return (int)i;
      }
      
        return -1;
    }
}

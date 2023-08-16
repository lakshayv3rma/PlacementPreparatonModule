class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> res=new ArrayList<>();
        helper(s,new ArrayList<>(),res);
        return res;
    }
    public void helper(String s,List<String> temp, List<List<String>> res){
        if(s.length()==0 || s==null){
            res.add(new ArrayList<>(temp));
            return;
        }
        for(int i=1;i<=s.length();i++){
            String s1=s.substring(0,i);
            if(!isPalin(s1))continue;

            temp.add(s1);
            helper(s.substring(i,s.length()),temp,res);
            temp.remove(temp.size()-1);
        }
        return;
    }
    public boolean isPalin(String s){
        int i=0,j=s.length()-1;
        while(i<j){
            if(s.charAt(i)==s.charAt(j)){
                i++;j--;
            }
            else
            return false;
        }
        return true;
    }
}

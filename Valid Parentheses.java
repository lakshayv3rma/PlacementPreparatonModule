class Solution {
    public boolean isValid(String s) {
        Stack<Character> st=new Stack<>();
      int i;
      for(i=0;i<s.length();i++)
      {
        char c=s.charAt(i);
         if(c=='{' || c=='(' || c=='[')
           st.push(c);
        else
        {
          if(st.isEmpty())
            break;
          char a=st.peek();
          if((c=='}' && a=='{') || (a=='(' && c==')') || (a=='[' && c==']'))
           st.pop();
          else 
            break;
        }
      
      }
       if(st.isEmpty() && i<s.length())
         return false;
        if(!st.isEmpty())
          return false;
        return true;
    }
}

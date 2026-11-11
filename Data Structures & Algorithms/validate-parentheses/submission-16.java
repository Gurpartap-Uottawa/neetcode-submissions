class Solution {
    public boolean isValid(String s) {
        char[] c=s.toCharArray();
        Stack<Character> s1 = new Stack<Character>();
        for(int i=0;i<c.length;i++){
            if(c[i]=='(' || c[i]=='[' || c[i]=='{')
            s1.push(c[i]);
            else if(c[i]==')' && !s1.isEmpty() && s1.peek()=='(')
            s1.pop();
            else if(c[i]=='}' && !s1.isEmpty() &&  s1.peek()=='{')
            s1.pop();
            else if(c[i]==']' && !s1.isEmpty() &&  s1.peek()=='[')
            s1.pop();
            else
            return false;
        }
        return s1.isEmpty();
    }
}

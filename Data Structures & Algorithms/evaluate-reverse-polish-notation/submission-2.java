class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> s = new Stack<>();
        int a=0;
        int b=0;
        int result=0;
        for(int i=0;i<tokens.length;i++){
            if(!"+/-*".contains(tokens[i]))
            s.push(Integer.parseInt(tokens[i]));
            else if(tokens[i].equals("+")){
                a=s.pop();
                b=s.pop();
                s.push(a+b);
            } else if(tokens[i].equals("-")){
                a=s.pop();
                b=s.pop();
                s.push(b-a);
            } else if(tokens[i].equals("/")){
                a=s.pop();
                b=s.pop();
                s.push(b/a);
            } else{
                a=s.pop();
                b=s.pop();
                s.push(a*b);
            }
        }
        return s.pop();
    }
}

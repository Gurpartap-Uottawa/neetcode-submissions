class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> s = new Stack<>();
        int a=0;
        int b=0;
        int result=0;
        for(int i=0;i<tokens.length;i++){
            if(!"+/-*".contains(tokens[i]))
            s.push(Integer.parseInt(tokens[i]));
            else{
                a=s.pop();
                b=s.pop();
                switch(tokens[i]){
                    case "+":
                    s.push(a+b);
                    break;
                    case "-":
                    s.push(b-a);
                    break;
                    case "*":
                    s.push(a*b);
                    break;
                    default:
                    s.push(b/a);
                    break;
                }
            }
        }
        return s.pop();
    }
}

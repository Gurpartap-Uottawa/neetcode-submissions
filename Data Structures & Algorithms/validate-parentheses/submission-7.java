class Solution {
    public boolean isValid(String s) {
        ArrayList<Character> list = new ArrayList<Character>();
        char[] c = s.toCharArray();
        if(c.length<=1)
        return false;
        for(int i=0;i<c.length;i++){
            if(c[i]=='{' || c[i]=='(' || c[i]=='[')
            list.add(c[i]);
            else if((c[i]=='}' || c[i]==')' || c[i]==']') && list.size()==0)
            return false;
            else if(c[i]=='}' && list.get(list.size()-1)=='{'){
                list.remove(list.size()-1);
            } else if(c[i]==')' && list.get(list.size()-1)=='('){
                list.remove(list.size()-1);
            } else if(c[i]==']' && list.get(list.size()-1)=='['){
                list.remove(list.size()-1);
            } else
            return false;
        }
        if(list.size()!=0)
        return false;
        else
        return true;
    }
}

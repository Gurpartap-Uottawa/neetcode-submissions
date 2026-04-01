class Solution {
    public boolean isPalindrome(String s) {
        s=s.toUpperCase();
        char[] temp = s.toCharArray();
        String s2="";
        for(int i=0;i<temp.length;i++){
            if((temp[i]>='a' && temp[i]<='z')||(temp[i]>='A' && temp[i]<='Z')||(temp[i]>='0' && temp[i]<='9'))
            s2+=temp[i];
        }
        System.out.println(s2);
        char[] c = s2.toCharArray();
        int i=0;
        int j=c.length-1;
        if(c.length%2!=0){
            while(i!=j){
                if(c[i] == c[j]){
                    i++;
                    j--;
                }
                else
                return false;
            }
        } else if(c.length%2==0){
            while(i<j){
                if(c[i] == c[j]){
                    i++;
                    j--;
                }
                else
                return false;
            }
        }
        return true;
    }
}

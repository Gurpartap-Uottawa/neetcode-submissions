class Solution {
    public int reverse(int x) {
        int ans=0,flag=0,rem=0;
        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;
        int x1=10;
        int y1=1;
        if(x == Integer.MIN_VALUE) return 0;
        if(x<0){
            flag=1;
            x=x*-1;
        }
        while(x>0){
            rem=x%x1;
            if (ans > max / 10 || (ans == max / 10 && rem > 7)) return 0;
            ans=ans*10+rem;
            x=x/x1;
        }
        if(ans<=max && ans>=min)
        return flag==1?ans*-1:ans;
        else 
        return 0;
    }
}
class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> h = new HashSet<Integer>();
        int sum=0;
        while(true){
            sum+=(n%10)*(n%10);
            System.out.println(sum);
            n/=10;
            System.out.println(n);
            if(n==0 && sum!=1){
                n=sum;
                sum=0;
                if(!h.contains(n))
                h.add(n);
                else
                break;
            } else if(n==0 && sum==1)
            return true;
        }
        return false;
    }
}

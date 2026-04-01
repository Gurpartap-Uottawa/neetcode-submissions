class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        Arrays.sort(piles);
        if(piles.length==h)
        return piles[piles.length-1];
        int r = piles[piles.length-1];
        int l = 1;
        int ans=l;
        while(l<=r){
            int k=(l+r)/2;
            int totalTime=0;
            for(int p:piles)
            totalTime+=Math.ceil((double)p/k);
            if(totalTime<=h){
                ans=k;
                r=k-1;
            } else
            l=k+1;
        }
        return ans;
    }
}

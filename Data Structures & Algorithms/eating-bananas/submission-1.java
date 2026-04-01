class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        Arrays.sort(piles);
        int maxTime = piles[piles.length-1];
        int minTime = 1;
        int ans=minTime;
        while(minTime<=maxTime){
            int k=(minTime+maxTime)/2;
            int totalTime=0;
            for(int p:piles)
            totalTime+=Math.ceil((double)p/k);
            if(totalTime<=h){
                ans=k;
                maxTime=k-1;
            } else
            minTime=k+1;
        }
        return ans;
    }
}

class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int total = 0;
        if(cost.length==1)
        return cost[0];
        if(cost.length==2)
        return cost[0]>cost[1]?cost[1]:cost[0];
        if(cost.length==3)
        return cost[0]+cost[2]>cost[1]?cost[1]:cost[0]+cost[2];
        for(int i=0;i<cost.length-1;i++){
            if(cost[i]>=cost[i+1]){
                total+=cost[i+1];
                i++;
            } else {
                total+=cost[i];
            }
        }
        return total;
    }
}

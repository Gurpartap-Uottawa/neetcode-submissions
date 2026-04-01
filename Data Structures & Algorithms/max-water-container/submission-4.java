class Solution {
    public int maxArea(int[] heights) {
        int l=0;
        int r=heights.length-1;
        int area=0;
        int areaMax=0;
        while(l<r){
            area = Math.min(heights[l],heights[r])*(r-l);
            System.out.println("L="+heights[l]);
            System.out.println("R="+heights[r]);
            System.out.println("R-L="+(r-l));
            System.out.println("Area="+area);
            System.out.println();
            if(area>areaMax)
            areaMax=area;
            if(heights[l]>heights[r])
            r--;
            else
            l++;
        }
        return areaMax;
    }
}

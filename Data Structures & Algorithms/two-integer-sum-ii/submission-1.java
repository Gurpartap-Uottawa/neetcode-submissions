class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int x=0,y=numbers.length-1;
        while(x<y){
            int sum=numbers[x]+numbers[y];
            if(sum>target)
            y--;
            else if(sum<target)
            x++;
            else
            return new int[] {x+1,y+1};
        }
        return new int[0];
    }
}

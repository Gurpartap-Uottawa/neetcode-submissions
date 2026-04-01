class Solution {
    public int[] productExceptSelf(int[] nums) {
        int total=1;
        int zeroCount=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0)
            total*=nums[i];
            else
            zeroCount++;
        }
        if(zeroCount==0){
            for(int i=0;i<nums.length;i++){
                if(nums[i]!=0)
                nums[i]=total/nums[i];
            }
        } else if(zeroCount==1){
            for(int i=0;i<nums.length;i++){
                if(nums[i]==0)
                nums[i]=total;
                else
                nums[i]=0;
            }
        } else 
        return new int[nums.length];
        return nums;
    }
}  

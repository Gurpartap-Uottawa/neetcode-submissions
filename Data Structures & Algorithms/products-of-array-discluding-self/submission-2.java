class Solution {
    public int[] productExceptSelf(int[] nums) {
        int pre=1,post=1,i=0,j=0;
        int res[] = new int[nums.length];
        // for(i=0;i<nums.length;i++)
        //     res[i]=1;
        Arrays.fill(res,1);
        i=0;j=0;
        while(j<nums.length){
            res[j++]=pre;
            pre*=nums[i++];
        }
        i=nums.length-1;j=i;
        while(j>=0){
            res[j--]*=post;
            post*=nums[i--];
        }
        return res;
    }
}  

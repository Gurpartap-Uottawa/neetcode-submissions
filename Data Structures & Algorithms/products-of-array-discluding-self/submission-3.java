class Solution {
    public int[] productExceptSelf(int[] nums) {
        // int pre=1,post=1,i=0,j=0;
        // int res[] = new int[nums.length];
        // Arrays.fill(res,1);
        // while(j<nums.length){
        //     res[j]=pre;
        //     pre*=nums[i];
        //     j++;i++;
        // }
        // i=nums.length-1;j=i;
        // while(j>=0){
        //     res[j]*=post;
        //     post*=nums[i];
        //     j--;i--;
        // }
        // return res;
        int res[] = new int[nums.length];
        res[0]=1;
        int product=1;
        for(int i=1;i<nums.length;i++)
            res[i]=res[i-1]*nums[i-1];
        product=1;
        for(int i=nums.length-1;i>=0;i--){
            res[i]=res[i]*product;
            product*=nums[i];
        }
        return res;
    }
}  

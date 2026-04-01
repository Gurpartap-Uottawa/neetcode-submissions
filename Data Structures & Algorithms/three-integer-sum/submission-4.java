class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            int l=i+1;
            int r=nums.length-1;
            while(l<r){
                int sum=nums[i]+nums[l]+nums[r];
                if(sum>0)
                r--;
                else if(sum<0)
                l++;
                else{
                    result.add(Arrays.asList(nums[i],nums[l],nums[r]));
                    if(nums[l+1]==nums[l] && l+2<r)
                    l+=2;
                    else 
                    l++;
                    if(nums[r-1]==nums[r] && r-2>l)
                    r-=2;
                    else 
                    r--;
                }
                if(nums[i]==nums[i+1])
                ++i;
            }
        }
        return result;
    }
}

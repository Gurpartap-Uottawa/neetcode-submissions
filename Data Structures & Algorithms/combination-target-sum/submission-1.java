class Solution {
    List<List<Integer>> res;
    int sum;
    public void dfs(int[]nums,int target,List<Integer> curr,int i,int sum){
        if(target==sum){
            res.add(new ArrayList(curr));
            return;
        }
        if(sum>target || i>=nums.length)
        return;

        curr.add(nums[i]);
        dfs(nums,target,curr,i,sum+nums[i]);
        curr.remove(curr.size()-1);
        dfs(nums,target,curr,i+1,sum);
    }

    public List<List<Integer>> combinationSum(int[] nums, int target) {
        res = new ArrayList<List<Integer>>();
        sum=0;
        List<Integer> curr = new ArrayList<Integer>();
        dfs(nums,target,curr,0,sum);
        return res;
    }
}

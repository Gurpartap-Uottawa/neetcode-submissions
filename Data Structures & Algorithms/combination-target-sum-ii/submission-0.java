class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> ans = new ArrayList<>();
        Arrays.sort(candidates);
        dfs(candidates,target,res,ans,0,0);
        return res;
    }

    public void dfs(int[] candidates, int target, List<List<Integer>> res, List<Integer> ans, int i,int sum){
        if(sum==target){
        res.add(new ArrayList<>(ans));
        return;
        }
        if(sum>target || i==candidates.length)
        return;

        ans.add(candidates[i]);
        dfs(candidates,target,res,ans,i+1,sum+candidates[i]);
        ans.remove(ans.size()-1);

        while(i+1<candidates.length && candidates[i] == candidates[i+1])
        i++;
        dfs(candidates,target,res,ans,i+1,sum);
    }
}

class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        permutation(nums,result,new boolean[nums.length],new ArrayList<>());
        return result;
    }

    public void permutation(int[] nums,List<List<Integer>> result,boolean[] used,List<Integer> perm){
        if(perm.size()>=nums.length){
            result.add(new ArrayList<>(perm));
            return;
        }

        for(int i=0;i<nums.length;i++){
            if(used[i]) continue;
            used[i]=true;
            perm.add(nums[i]);
            permutation(nums,result,used,perm);
            used[i]=false;
            perm.remove(perm.size()-1);
        }
    }
}

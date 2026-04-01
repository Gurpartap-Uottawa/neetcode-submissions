class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> h = new HashSet<Integer>();
        for(int num:nums){
            if(!h.contains(num)){
                h.add(num);
            } else
            return true;
        }
        return false;
    }
}

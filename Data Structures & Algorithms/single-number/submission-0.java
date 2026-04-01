class Solution {
    public int singleNumber(int[] nums) {
        Set<Integer> l = new HashSet();
        for(int num:nums){
            if(l.contains(num))
            l.remove(num);
            else
            l.add(num);
        }
        return l.iterator().next();
    }
}

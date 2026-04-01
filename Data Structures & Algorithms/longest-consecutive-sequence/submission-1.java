class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> series = new HashSet<>();
        for(int num:nums)
        series.add(num);
        int longest = 0;
        for(int num:series){
            int length=1;
            while(series.contains(num+length))
            length++;
            longest=Math.max(longest,length);
        }
        return longest;
    }
}

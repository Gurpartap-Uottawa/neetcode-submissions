class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> hm = new HashSet<Character>();
        int maxLength = 0;
        int length=0;
        int l=0;
        int r=0;
        while(r<s.length() && l<s.length()){
            if(!hm.contains(s.charAt(r))){
                hm.add(s.charAt(r));
                r++;
                length++;
            } else {
                if(length>maxLength)
                maxLength=length;
                hm.clear();
                l++;
                r=l;
                length=0;
            }
        }
        if(length>maxLength)
        return length;
        else
        return maxLength;
    }
}

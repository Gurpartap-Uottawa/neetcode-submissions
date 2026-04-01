class Solution {
    public boolean isAnagram(String s, String t) {
        char[] s1 = s.toCharArray();
        char[] t1 = t.toCharArray();
        int[] s2 = new int[26];
        int[] t2 = new int[26];
        if(s1.length != t1.length)
            return false;
        for(int i=0;i<s1.length;i++){
            s2[(s1[i]-'a')]++;
        }
        for(int j=0;j<t1.length;j++){
            t2[(t1[j]-'a')]++;
        }
        System.out.println(Arrays.toString(s2));
        System.out.println(Arrays.toString(t2));

        if(Arrays.equals(s2, t2))
        return true;
        else
        return false;
    }
}

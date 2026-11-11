public class Solution {
    public int[][] merge(int[][] intervals) {
    if (intervals.length <= 1) return intervals;
    Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
    List<int[]> result = new ArrayList<>();
    int[] current = intervals[0];
    result.add(current);
    for (int[] next : intervals) {
        if (next[0] <= current[1]) {
            current[1] = Math.max(current[1], next[1]);  // overlap: extend
        } else {
            current = next;
            result.add(current);
        }
    }
    return result.toArray(new int[0][]);
    }
}
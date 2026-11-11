public class Solution {
    public int[][] merge(int[][] intervals) {
        // TreeMap<Integer, Integer> map = new TreeMap<>();

        // for (int[] interval : intervals) {
        //     map.put(interval[0], map.getOrDefault(interval[0], 0) + 1);
        //     System.out.println("1: "+map.values());
        //     map.put(interval[1], map.getOrDefault(interval[1], 0) - 1);
        //     System.out.println("2: "+map.values());
        // }

        // List<int[]> res = new ArrayList<>();
        // int have = 0;
        // int[] interval = new int[2];

        // for (int point : map.keySet()) {
        //     if (have == 0) interval[0] = point;
        //     have += map.get(point);
        //     if (have == 0) {
        //         interval[1] = point;
        //         res.add(new int[] {interval[0], interval[1]});
        //     }
        // }

        // return res.toArray(new int[res.size()][]);
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
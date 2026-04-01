class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for(int stone:stones){
            minHeap.add(-stone);
        }
        int first=0;
        int second=0;
        while(minHeap.size()>1){
            first=minHeap.poll();
            second=minHeap.poll();
            minHeap.add(first-second);
        }
        return minHeap.poll()*-1;
    }
}

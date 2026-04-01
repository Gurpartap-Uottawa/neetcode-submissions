class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>();
        for(int stone:stones){
            maxHeap.add(-stone);
        }
        int first=0;
        int second=0;
        while(maxHeap.size()>1){
            first=maxHeap.poll();
            System.out.println(first);
            second=maxHeap.poll();
            System.out.println(second);
            maxHeap.add(first-second);
        }
        return maxHeap.poll()*-1;
    }
}

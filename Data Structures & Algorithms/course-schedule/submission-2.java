class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        List<List<Integer>> graph = new ArrayList<>();
        for(int i=0;i<numCourses;i++){
            graph.add(new ArrayList<>());
        }
        for(int[] pre:prerequisites){
            int course=pre[0];
            int req=pre[1];
            graph.get(req).add(course);
        }
        int[] state = new int[numCourses];
        for(int i=0;i<numCourses;i++){
            if(state[i]==0 && hasCycle(i,graph,state)){
                return false;
            }
        }
        return true;
    }
    private boolean hasCycle(int node, List<List<Integer>> graph, int[] state){
        state[node] = 1;
        for(int nei:graph.get(node)){
            if(state[nei]==1)
            return true;
            if(state[nei]==0 && hasCycle(nei, graph, state))
            return true;
        }
        state[node] = 2;
        return false;
    }
}

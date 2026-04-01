class Solution {
    public int getMax(Map<Integer,Integer> hm){
        int max=0;
        int result=0;
        for (Map.Entry<Integer, Integer> entry : hm.entrySet()) {
            int key = entry.getKey();
            int value = entry.getValue();
            if(value>max){
            max=value;
            result=key;
            }
        }
        hm.remove(result);
        return result;
    }
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> hm= new HashMap<>();
        int[] result = new int[k];
        for(int key:nums){
            if(hm.get(key)==null)
                hm.put(key,1);
            else 
                hm.put(key,hm.get(key)+1);
        }
        for(int i=0;i<k;i++){
            result[i]=getMax(hm);
        }
        return result;
    }
}

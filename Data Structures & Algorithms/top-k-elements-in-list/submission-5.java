class Solution {
    public int getMax(Map<Integer,Integer> hm){
        int max=0;
        int result=0;
        for (Map.Entry<Integer, Integer> entry : hm.entrySet()) {
            int key = entry.getKey();
            int value = entry.getValue();
            System.out.println("key="+key);
            System.out.println("value="+value);
            if(value>max){
            max=value;
            result=key;
            }
            System.out.println("result="+result);
        }
        hm.remove(result);
        System.out.println(hm.entrySet());
        System.out.println(result);
        return result;
    }
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> hm= new HashMap<>();
        int[] result = new int[k];
        for(int key:nums){
            if(hm.get(key)==null)
                hm.put(key,1);
            else {
                int count = hm.get(key);
                hm.put(key,++count);
            }
        }
        System.out.println(hm.entrySet());
        for(int i=0;i<k;i++){
            result[i]=getMax(hm);
        }
        return result;
    }
}

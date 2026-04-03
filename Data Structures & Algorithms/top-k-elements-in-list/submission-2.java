class Solution {
    public int[] topKFrequent(int[] nums, int k) {
       HashMap<Integer,Integer> map = new HashMap<>();
       for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
       }
       List<Map.Entry<Integer,Integer>> list = new ArrayList<>(map.entrySet());
       list.sort((a,b)->b.getValue().compareTo(a.getValue()));
       return list.stream().map(Map.Entry<Integer,Integer>::getKey).limit(k).mapToInt(Integer::intValue).toArray();
    }
}

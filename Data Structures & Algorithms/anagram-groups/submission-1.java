class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
           HashMap<String,List<String>> mapita = new HashMap<>();
            for(int i = 0 ; i < strs.length ; i++){
                char[] letters = strs[i].toCharArray();
                Arrays.sort(letters);
                int finalI = i;
               String key = new String(letters);
                mapita.compute(key,(k, list)->{
                    if(list == null)list = new ArrayList<>();
                    list.add(strs[finalI]);
                    return list;
                });
            }
            ArrayList<List<String>> flist = new ArrayList<>();
            for(Map.Entry<String,List<String>>fmap : mapita.entrySet()){
                flist.add(fmap.getValue());
            }
            return flist;
    }
}

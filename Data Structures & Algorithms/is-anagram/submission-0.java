class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
                return false;
        }
        Hashtable<Character,Integer> hashTable = new Hashtable<>();
        Hashtable<Character,Integer> hashTable2 = new Hashtable<>();
        for(int i = 0 ; i < s.length() ; i++){
            hashTable.put(s.charAt(i),hashTable.getOrDefault(s.charAt(i),0)+1);
        }
        for(int i = 0 ; i < t.length() ; i++){
            hashTable2.put(t.charAt(i),hashTable2.getOrDefault(t.charAt(i),0)+1);
        }
        if(hashTable.equals(hashTable2)){
            return true;
        }
        return false;
    }
}

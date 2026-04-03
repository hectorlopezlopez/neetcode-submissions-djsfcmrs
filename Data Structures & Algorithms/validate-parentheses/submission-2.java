class Solution {
    public boolean isValid(String s) {
      Stack<Character>  st = new Stack<>();
        HashMap<Character,Character> map = new HashMap<>();
       map.put(')','(');
        map.put(']','[');
        map.put('}','{');
        for(char caracter : s.toCharArray()){
            if(map.containsKey(caracter)){
                if(st.isEmpty())return false;
                if(st.pop()!=map.get(caracter))return false;
            }else{
                st.push(caracter);
            }
        }
        return st.isEmpty();

    }
}

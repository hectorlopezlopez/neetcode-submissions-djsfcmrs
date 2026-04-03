class Solution {
    public boolean isPalindrome(String s) {
        String fString = s.toLowerCase().chars().filter(Character::isLetterOrDigit).mapToObj(c->String.valueOf((char)c)).collect(Collectors.joining());
        int left=0 , rigth = fString.length()-1;
        while(left<rigth){
            if(fString.charAt(left)!=fString.charAt(rigth)){
                return false;
            }
            left++;
            rigth--;
        }
        return true;
    }
}

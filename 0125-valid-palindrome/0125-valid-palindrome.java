class Solution {
    public boolean isPalindrome(String s) {
        String v="";
        String reverse="";
        for(int i=0; i<s.length(); i++){
            char ch= s.charAt(i);
            if(ch>='A' && ch<='Z'){
                ch= (char)(ch+32);
            }
            if((ch>='a' && ch<='z') || (ch>='0' && ch<= '9')){
                v= v+ch;

            }
        }
        for(int i= v.length()-1; i>=0; i--){
            reverse= reverse + v.charAt(i);
        }
        if(v.length()!=reverse.length()){
            return false;
        }
        for(int i=0; i<v.length(); i++){
            if(v.charAt(i)!= reverse.charAt(i)){
                return false;
            }
        }
        return true;
    }
}
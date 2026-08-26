class Solution {
    public String addSpaces(String s, int[] spaces) {
        // StringBuilder ans= new StringBuilder();
        // int j=0;
        // for(int i=0; i<s.length(); i++){
        //     if(j<spaces.length && i==spaces[j]){
        //         ans.append(" ");
        //         j++;
        //     }
        //     ans.append(s.charAt(i));
        // }
        // return ans.toString();
        char[] res= new char[s.length()+ spaces.length];
        int idx=0;
        
        int j=0;
        for(int i=0; i<s.length(); i++){
            if(j<spaces.length&& i==spaces[j]){
                res[idx]= ' ';
                idx++;
                j++;
            }
            res[idx]=s.charAt(i);
            idx++;
        }
        return new String(res);
    }
}
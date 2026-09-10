class Solution {
    public void reverseString(char[] s) {
        // int start=0;
        // int end= s.length-1;
        // while(start<end){
        //     char temp= s[start];
        //     s[start]=s[end];
        //     s[end]= temp;
        //     start++;
        //     end--;
        // }
        Stack<Character> st= new Stack<>();
        for(int i=0; i<s.length; i++){
            st.push(s[i]);
        }
        for(int i=0; i<s.length; i++){
            s[i]= st.pop();

        }
    }
}
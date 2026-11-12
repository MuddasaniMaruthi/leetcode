class Solution {
    public String reverseWords(String s) {
        Stack<Character>st=new Stack<>();
        String ans="";
        s=s.trim();
        for(int i=s.length()-1;i>=0;i--){
            char ch=s.charAt(i);
            if(ch!=' '){
                st.push(ch);
            }
            else if(!st.isEmpty()){
                while(!st.isEmpty()){
                    ans+=st.pop();
                }
                if (i > 0 && !ans.isEmpty() && ans.charAt(ans.length()-1) != ' ') {
                    ans += " ";
                }
            }
           
        }
        while(!st.isEmpty()){
            ans+=st.pop();
        }
        return ans;
    }
}
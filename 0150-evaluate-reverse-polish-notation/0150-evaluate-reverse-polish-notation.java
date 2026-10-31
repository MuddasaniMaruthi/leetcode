class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer>st=new Stack<>();
        for(int i=0;i<tokens.length;i++){
            String ch=tokens[i];
            if(ch.equals("+")||ch.equals("*")||ch.equals("-")||ch.equals("/")){
                int t1=st.pop();
                int t2=st.pop();
                int ans=0;
                if(ch.equals("+")){
                    ans=t2+t1;
                }
                else if(ch.equals("-")){
                    ans=t2-t1;
                }
                else if(ch.equals("*")){
                    ans=t2*t1;
                }
                else if(ch.equals("/")){
                    ans=t2/t1;
                }
                st.push(ans);
            }
            else{
            st.push(Integer.parseInt(ch));
            }
        }
        return st.peek();
    }
}
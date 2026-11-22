class Solution {
    public boolean checkString(String s) {
        int c=0;
        int ac=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='b'){
                c++;
            }
            else if(c>=1&&ch=='a'){
                return false;
            }
        }
        return true;
    }
}
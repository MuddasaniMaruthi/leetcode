class Solution {
    public int smallestNumber(int n) {
        for(int i=n;i<Integer.MAX_VALUE;i++){
            if(count(i)==0){
                return i;
            }
        }
        return -1;
    }
    public int count(int temp){
        int c=0;
        while(temp>0){
            if((temp&1)==0){
                c++;
            }
            temp=temp>>1;
        }
        return c;
    }
}
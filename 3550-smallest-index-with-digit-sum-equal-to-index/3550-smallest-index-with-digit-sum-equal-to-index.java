class Solution {
    public int smallestIndex(int[] nums) {
        int min=-1;
        for(int i=0;i<nums.length;i++){
            if(func(nums[i])==i){
                return i;
            }
        }
        return min;

    }
    static int func(int num){
        int s=0;
        if(num<10){
            return num;
        }
        else{
        while(num>0){
            int rem=num%10;
            s+=rem;
            num=num/10;
        }
        }
        return s;
    }
}
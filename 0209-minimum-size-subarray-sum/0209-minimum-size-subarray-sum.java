class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int sum=0;
        int max=Integer.MAX_VALUE;
        int i=0;
        for(int j=0;j<nums.length;j++){
            sum+=nums[j];
            
                while(sum>=target){
                    max=Math.min(max,j-i+1);
                    sum=sum-nums[i];
                    i++;
                }
            }
        if(max==Integer.MAX_VALUE){
            return 0;
        }
        return max;
    }
}
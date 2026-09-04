class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>max){
                max=nums[i];

            }
           int  min=ans(nums,i);
            if(max-min<=k){
                return i;
            }
        }
        return -1;
    }
    static int ans(int [] nums,int i){
        int min=nums[i];
        for(int j=i;j<nums.length;j++){
            min=Math.min(nums[j],min);
        }
        return min;
    }
}
class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int [] premax=new int[nums.length];
        int [] suffmin=new int[nums.length];
        int max=nums[0];
        premax[0]=nums[0];
        for(int i=1;i<nums.length;i++){
            max=Math.max(max,nums[i]);
            premax[i]=max;
        }
        int min=nums[nums.length-1];
        suffmin[nums.length-1]=min;
        for(int i=nums.length-2;i>=0;i--){
            min=Math.min(min,nums[i]);
            suffmin[i]=min;
        }
        for(int i=0;i<nums.length;i++){
            if(premax[i]-suffmin[i]<=k){
                return i;
            }
        }
        return -1;
    }
    
}
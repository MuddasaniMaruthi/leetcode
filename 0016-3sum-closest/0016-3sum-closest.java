class Solution {
    public int threeSumClosest(int[] nums, int target) {
        
        int min=Integer.MAX_VALUE;
        int ans=0;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                for(int k=j+1;k<nums.length;k++){
                    int sum=0;
                    sum+=nums[i]+nums[j]+nums[k];
                    if(Math.abs(sum-target)<min){
                        min=Math.abs(sum-target);
                        ans=sum;
                    }
                }
            }
        }
        return ans;
    }
}
class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int ic=1;
        int ac=ic;

        int dc=1;
        int ad=dc;
        for(int i=1;i<nums.length;i++){
            if(nums[i]>nums[i-1]){
                ic++;
                ac=Math.max(ac,ic);
                dc=1;
            }
            else if(nums[i]<nums[i-1]){
                dc++;
                ad=Math.max(dc,ad);
                ic=1;
            }
            else{
                ic=1;
                dc=1;
                
            }
            
        }
        int ans=Math.max(ac,ad);
        return ans;
    }
}
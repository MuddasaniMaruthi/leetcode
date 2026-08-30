class Solution {
    public int minimumDeletions(int[] nums) {
        if(nums.length==1){
            return 1;
        }
        int ans=Integer.MAX_VALUE;
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        int mi=0;
        int maxi=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>max){
                max=nums[i];
                maxi=i;
            }
            if(nums[i]<min){
                min=nums[i];
                mi=i;
            }
        }
        ans=Math.min(ans,Math.max(maxi,mi)+1);
        ///ans=Math.mini(ans, )
        ans=Math.min(ans,nums.length-Math.min(maxi,mi));
        ans=Math.min(ans,Math.min(maxi,mi)+1+nums.length-Math.max(maxi,mi));
        return ans;

    }
}
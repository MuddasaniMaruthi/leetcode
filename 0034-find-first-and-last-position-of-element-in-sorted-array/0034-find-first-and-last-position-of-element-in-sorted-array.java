class Solution {
    public int[] searchRange(int[] nums, int target) {
         int left=lower(nums,target);
        int right=upper(nums,target);
        return new int[] {left,right};
    }
    static int lower(int [] nums,int target){
        int ans=-1;
        int low=0;
        int high=nums.length-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(nums[mid]==target){
                ans=mid;
                high=mid-1;
            }
           else if(target>nums[mid]){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return ans;
    }
    static int upper(int [] nums,int target){
        int ans=-1;
        int low=0;
        int high=nums.length-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(nums[mid]==target){
                ans=mid;
                low=mid+1;
            }
           else if(target>nums[mid]){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return ans;
    }
}
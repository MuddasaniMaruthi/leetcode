class Solution {
    public int minOperations(int[] nums, int x) {
        int total=0;
        for(int i=0;i<nums.length;i++){
            total+=nums[i];
        }
        int com=total-x;
        int min=-1;
        int j=0;
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            while(sum>com&&j<=i){
                sum-=nums[j];
                j++;
            }
            if(sum==com){
                min=Math.max(min,i-j+1);
            }

        }
        if(min==-1){
            return -1;
        }

        return nums.length-min;
    }
}
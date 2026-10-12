class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        int i=0;
        int [] ans=new int[2];
        int j=0;
        while(i<nums.length){
            int correct=nums[i];
           if(nums[i]!=nums[correct]){
                swap(nums,i,correct);

            }
            else{
                i++;
            }
        }
        for(int k=0;k<nums.length;k++){
            if(nums[k]!=k){
                ans[j]=nums[k];
                j++;
            }
        }
        return ans;
    }
    static void swap(int [] nums,int f,int s){
        int temp=nums[f];
        nums[f]=nums[s];
        nums[s]=temp;
    }
}
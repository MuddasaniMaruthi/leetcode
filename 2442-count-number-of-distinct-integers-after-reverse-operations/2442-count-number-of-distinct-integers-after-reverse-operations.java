class Solution {
    public int countDistinctIntegers(int[] nums) {
        HashSet<Integer>set=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
            if(nums[i]<10){
                continue;
            }
            else{
                int temp=nums[i];
                int ans=0;
                while(temp>0){
                    int rem=temp%10;
                    ans=ans*10+rem;
                    temp=temp/10;
                }
                set.add(ans);
            }
        }
        return set.size();
    }
}
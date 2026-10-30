class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        HashMap<Integer,Integer>map=new HashMap<>();
        long sum=0;
        long ans=0;
        int i=0;
        for(int j=0;j<k;j++){
            sum+=nums[j];
            if(map.containsKey(nums[j])){
                map.put(nums[j],map.get(nums[j])+1);
            }
            else{
                map.put(nums[j],1);
            }
        }
        if(map.size()==k){
        ans=Math.max(ans,sum);
        }
        for(int j=k;j<nums.length;j++){
            sum+=nums[j]-nums[i];
            int left=nums[i];
            i++;
            if(map.containsKey(nums[j])){
                map.put(nums[j],map.get(nums[j])+1);
            }
            else{
                map.put(nums[j],1);
            }
           map.put(left,map.get(left)-1);
            if(map.get(left)==0){
                map.remove(left);
            }
            if(map.size()==k){
                ans=Math.max(ans,sum);
            }
            

        }
        return  ans;
    }
}
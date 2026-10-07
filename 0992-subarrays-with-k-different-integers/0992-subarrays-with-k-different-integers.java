class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
        return atmost(nums,k)-atmost(nums,k-1);
    }
    static int atmost(int [] nums,int k){
        HashMap<Integer,Integer>map=new HashMap<>();
        int j=0;
        int c=0;
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);
            }
            else{
                map.put(nums[i],1);
            }
            
                while(map.size()>k){
                    int left=nums[j];
                    map.put(left,map.get(left)-1);
                    if(map.get(left)==0){
                        map.remove(left);
                    }
                    j++;
                }
                c+=i-j+1;
            
        }
        return c;
    }
}
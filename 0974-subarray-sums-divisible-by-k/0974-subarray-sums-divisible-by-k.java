class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        HashMap<Integer,Integer>map=new HashMap<>();
        int sum=0;
        int c=0;
        map.put(0,1);
        for(int i=0;i<nums.length;i++){
           
            sum+=nums[i];
            int com=sum%k;
            if(com<0){
                com+=k;
            }
            if(map.containsKey(com)){
                c+=map.get(com);
            }
            if(map.containsKey(com)){
                map.put(com,map.get(com)+1);
            }
            else{
                map.put(com,1);
            }
        }
        return c;
    }
}
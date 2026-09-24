class Solution {
    static int sumc=0;
    public int subsetXORSum(int[] nums) {
        ArrayList<Integer>list=new ArrayList<>();
        sumc=0;
        print(0,list,0,nums);
        return sumc;
    }
    static void print(int i,ArrayList<Integer>list,int sum,int[] nums){
        if(i==nums.length){
            sumc+=sum;
            return ;
        }
        list.add(nums[i]);
        print(i+1,list,sum^nums[i],nums);
        list.remove(list.size()-1);
        print(i+1,list,sum,nums);
    }
}
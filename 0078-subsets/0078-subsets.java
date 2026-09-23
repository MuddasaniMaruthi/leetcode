class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        ArrayList<Integer>list=new ArrayList<>();
        print(0,list,nums,ans);
        return ans;
    }
    static void  print(int i,ArrayList<Integer>list,int[] nums,List<List<Integer>> ans){
        if(i==nums.length){
            ans.add(new ArrayList<>(list));
            return ;
        }
        list.add(nums[i]);
        print(i+1,list,nums,ans);
        list.remove(list.size()-1);
        print(i+1,list,nums,ans);
    }
}
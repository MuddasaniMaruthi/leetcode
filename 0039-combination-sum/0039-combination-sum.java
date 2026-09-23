class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>>ans=new ArrayList<>();
        ArrayList<Integer>list=new ArrayList<>();
        print(0,ans,list,target,candidates);
        return ans;

    }
    static void print(int i,List<List<Integer>>ans,ArrayList<Integer>list,int target,int [] candidates){
        if(target==0){
            ans.add(new ArrayList<>(list));
            return ;
        }
        if (i == candidates.length || target < 0) {
            return;
        }
        
            list.add(candidates[i]);
            print(i,ans,list,target-candidates[i],candidates);
            list.remove(list.size()-1);
        
        print(i+1,ans,list,target,candidates);
    }
}
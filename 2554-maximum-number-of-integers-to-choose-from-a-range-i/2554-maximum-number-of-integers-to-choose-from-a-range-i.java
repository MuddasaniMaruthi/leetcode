class Solution {
    public int maxCount(int[] banned, int n, int maxSum) {
        ArrayList<Integer>list=new ArrayList<>();
        HashSet<Integer>map=new HashSet<>();
        for(int i=0;i<banned.length;i++){
            map.add(banned[i]);
        }
        for(int i=1;i<=n;i++){
            if(!map.contains(i)){
                list.add(i);
            }
        }
        int sum=0;
        int c=0;
        for(int i=0;i<list.size();i++){
             sum+=list.get(i);
            if(sum<=maxSum){
                
                c++;
            }
           
        }
        return c;
    }
}
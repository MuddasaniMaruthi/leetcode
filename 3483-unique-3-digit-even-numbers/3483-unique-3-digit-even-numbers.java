class Solution {
    public int totalNumbers(int[] digits) {
        HashSet<Integer>set=new HashSet<>();
        for(int i=0;i<digits.length;i++){
          for(int j=0;j<digits.length;j++){
            for(int k=0;k<digits.length;k++){
                if(i!=j&&j!=k&&k!=i){
                    int pro=((digits[i]*10)+(digits[j]))*10+digits[k];
                    if(pro>99&&!set.contains(pro)&&pro%2==0){
                        set.add(pro);
                    }
                }
            }
          }  
        }
        return set.size();
    }
}
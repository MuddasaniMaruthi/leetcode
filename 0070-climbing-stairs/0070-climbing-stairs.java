class Solution {
    public int climbStairs(int n) {
        int [] dp=new int[n+1];
        Arrays.fill(dp,-1);
        return solve(n,dp);
    }
    static int solve(int i,int [] dp){
        if(i<=1){
            return 1;

        }
        if(i<0){
            return 0;
        }
        if(dp[i]!=-1){
            return dp[i];
        }
        int left=solve(i-1,dp);
        int right=solve(i-2,dp);
        dp[i]=left+right;
        return dp[i];
    }
}
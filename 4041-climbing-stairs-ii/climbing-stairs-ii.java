class Solution {
    public int climbStairs(int n, int[] costs) {
        int dp[]=new int[n];
        dp[0]=1+costs[0];
        if(n==1) return dp[0];
        dp[1]=Math.min(dp[0]+costs[1]+1,4+costs[1]);
        if(n==2) return dp[1];
        dp[2]=Math.min(9+costs[2],Math.min(dp[0]+4+costs[2],dp[1]+1+costs[2]));
        if(n==3) return dp[2];
        for(int i=3;i<n;i++){
            dp[i]=Math.min(9+costs[i]+dp[i-3],Math.min(dp[i-2]+costs[i]+4,dp[i-1]+costs[i]+1));
        }
        return dp[n-1];
    }
}
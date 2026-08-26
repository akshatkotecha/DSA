class Solution {
    public int maxScoreSightseeingPair(int[] values) {
        int n=values.length;
        int dp[]=new int[n];
        dp[0]=values[0];
        int max=values[0];
        int ans=values[0];
        for(int i=1;i<n;i++){
            dp[i]=Math.max(dp[i-1],max+values[i]-i);
            max=Math.max(max,values[i]+i);
            ans=Math.max(ans,dp[i]);
        }
        return ans;

    }
}
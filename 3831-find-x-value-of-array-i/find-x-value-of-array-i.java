class Solution {
    public long[] resultArray(int[] nums, int k) {
        int n=nums.length;
        long dp[][]=new long[n][k];
        long ans[]=new long[k];
        for(int i=0;i<n;i++){
            dp[i][nums[i]%k]++;
            if(i>0){
                for(int j=0;j<k;j++){
                    dp[i][(int)(((long)nums[i]*j)%k)]+=dp[i-1][j];
                }
            }
        }
        for(int i=0;i<k;i++){
            for(int j=0;j<n;j++){
                ans[i]+=dp[j][i];
            }
        }
        return ans;
    }
}
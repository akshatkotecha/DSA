class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        int total=0;
        int n=nums.length;
        for(int num : nums) total+=num;
        int dp[][]=new int[n][2*total+1];
        dp[0][nums[0]+total]=1;
        dp[0][-nums[0]+total]+=1;
        for(int i=1;i<n;i++){
            for(int sum=-total;sum<=total;sum++){
                if(dp[i-1][sum+total]>0){
                    dp[i][sum+nums[i]+total]+=dp[i-1][sum+total];
                    dp[i][sum-nums[i]+total]+=dp[i-1][sum+total];
                }
            }
        }
        if(Math.abs(target)>total) return 0;
        else return dp[n-1][target+total];
    }
}
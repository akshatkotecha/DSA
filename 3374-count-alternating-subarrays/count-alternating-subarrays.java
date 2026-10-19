class Solution {
    public long countAlternatingSubarrays(int[] nums) {
        int n=nums.length;
        long dp[]=new long[n];
        long sum=0;
        Arrays.fill(dp,1);
        for(int i=1;i<n;i++){
            if(nums[i]!=nums[i-1]){
                dp[i]=dp[i-1]+1;
            }
            sum+=dp[i];
        }
        return 1+sum;
    }
}
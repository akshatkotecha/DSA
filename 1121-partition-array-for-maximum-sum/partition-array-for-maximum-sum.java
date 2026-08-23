class Solution {
    public int maxSumAfterPartitioning(int[] arr, int k) {
        int n=arr.length;
        int dp[]=new int[n+1];
        for(int i=n-1;i>=0;i--){
            int cur=0;
            int end=Math.min(n,i+k);
            for(int j=i;j<end;j++){
                cur=Math.max(cur,arr[j]);
                dp[i]=Math.max(dp[i],dp[j+1]+cur*(j-i+1));
            }
        }
        return dp[0];

    }
}
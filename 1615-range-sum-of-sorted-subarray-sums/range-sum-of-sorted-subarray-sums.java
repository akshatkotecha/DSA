class Solution {
    private static long mod=1000000007;
    public int rangeSum(int[] nums, int n, int left, int right) {
        int a[]=new int[n*(n+1)/2];
        int idx=0;
        for(int i=0;i<n;i++){
            int sum=0;
            for(int j=i;j<n;j++){
                sum+=nums[j];
                a[idx++]=sum;
            }
        }
        Arrays.sort(a);
        long ans=0;
        for(int i=left-1;i<right;i++) {
            ans+=a[i]%mod;
            ans%=mod;
        }
        return (int)ans;
    }
}
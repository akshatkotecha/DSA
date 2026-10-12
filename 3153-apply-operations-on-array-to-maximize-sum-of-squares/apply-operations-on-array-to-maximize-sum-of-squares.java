class Solution {
    static long mod=1000000007;
    public int maxSum(List<Integer> nums, int k) {
        int ans=0;
        int a[]=new int[32];
        for(int num : nums){
            for(int i=0;i<32;i++){
                if((num &(1<<i))!=0) a[i]++;
            }
        }
        while(k-->0){
            long x=0;
            for(int i=0;i<32;i++){
                if(a[i]>0) {
                    x|=(1L<<i);
                    a[i]--;
                }
            }
            ans+=(x*x)%mod;
            ans%=mod;
        }
        return ans;
    }
}
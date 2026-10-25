class Solution {
    static long mod=1000000007;
    public int valueAfterKSeconds(int n, int k) {
        long a[]=new long[n];
        Arrays.fill(a,1);
        while(k-->0){
            for(int i=1;i<n;i++){
                a[i]=(a[i-1]+a[i])%mod;
            }
        }
        a[n-1]%=mod;
        return (int)a[n-1];
    }
}
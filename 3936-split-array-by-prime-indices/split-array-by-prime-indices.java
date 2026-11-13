class Solution {
    public static boolean[] sievePrime(int n) {
        boolean[] p = new boolean[n + 1];
        Arrays.fill(p, true);
        p[0] = false;
        if (n >= 1) p[1] = false;

        for (int i = 2; i <= n / i; i++) {
            if (p[i]) {
                for (int j = i * i; j <= n; j += i)
                    p[j] = false;
            }
        }
        return p;
    }
    public long splitArray(int[] nums) {
        boolean []prime=sievePrime(1000000);
        long sum1=0;
        long sum2=0;
        for(int i=0;i<nums.length;i++){
            if(prime[i]) sum1+=nums[i];
            else sum2+=nums[i];
        }
        return Math.abs(sum1-sum2);
    }
}
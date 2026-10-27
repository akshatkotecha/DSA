class Solution {
    public int sumDivisibleByK(int[] nums, int k) {
        int a[]=new int[101];
        for(int num : nums) a[num]++;
        int ans=0;
        for(int i=0;i<101;i++){
            if(a[i]>0 && a[i]%k==0) ans+=a[i]*i;
        }
        return ans;
    }
}
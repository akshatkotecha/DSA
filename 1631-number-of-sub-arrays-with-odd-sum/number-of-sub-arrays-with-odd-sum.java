class Solution {
    final int MOD = 1_000_000_007;
    public int numOfSubarrays(int[] arr) {
        int total=0;
        long sum=0;
        int odd=0;
        int even =1;
        for(int num : arr){
            sum+=num;
            if(sum%2==0){
                total+=odd;
                even++;
            }
            else{
                total+=even;
                odd++;
            }
            total%=MOD;
        }
        return total;

    }
}
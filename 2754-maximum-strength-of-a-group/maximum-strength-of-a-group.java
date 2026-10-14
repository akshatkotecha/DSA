class Solution {
    public long maxStrength(int[] nums) {
        int n=nums.length;
        long ans=1;
        int largest=Integer.MIN_VALUE;
        int largeneg=Integer.MIN_VALUE;
        int neg=0;
        for(int num : nums){
            if(num!=0) ans*=num;
            if(num<0){
                largeneg=Math.max(largeneg,num);
                neg++;
            }
            largest=Math.max(largest,num);
        }
        if(largest==0 && neg<2) return 0;
        if(largest<0 && neg==1) return largeneg;
        if(ans>0) return ans;
        return ans/largeneg; 
    }
}
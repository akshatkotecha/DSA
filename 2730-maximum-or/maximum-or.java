class Solution {
    public long maximumOr(int[] nums, int k) {
        if(nums.length==1) return (long)nums[0]<<k;
        long pre[]=new long[nums.length];
        long suf[]=new long[nums.length];
        pre[0]=nums[0];
        suf[nums.length-1]=nums[nums.length-1];
        for(int i=1;i<nums.length;i++){
            pre[i]=pre[i-1] | nums[i];
        }
        for(int i=nums.length-2;i>=0;i--){
            suf[i]=suf[i+1] | nums[i];
        }
        long max=0;
        for(int i=0;i<nums.length;i++){
            long num=(long)nums[i]<<k;
            long cur;
            if(i==0){
                cur=num|suf[1];
            }
            else if(i==nums.length-1){
                cur=pre[nums.length-2]|num;
            }
            else cur=pre[i-1]|num|suf[i+1];
            max=Math.max(max,cur);
        }
        return max;
    }
}
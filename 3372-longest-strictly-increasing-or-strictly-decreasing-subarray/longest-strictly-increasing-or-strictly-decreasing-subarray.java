class Solution {
    public int longestMonotonicSubarray(int[] nums) {  
        int max=1;
        int cnt1=1;
        int cnt2=1;
        if(nums.length==1) return 1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]>nums[i-1]){
                cnt1++;
                cnt2=1;
            }
            else if(nums[i]<nums[i-1]){
                cnt2++;
                cnt1=1;
            }
            else{
                cnt1=1;
                cnt2=1;
            }
            max=Math.max(max,Math.max(cnt1,cnt2));
        }
        return max;
    }
}
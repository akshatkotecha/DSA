class Solution {
    public long maxAlternatingSum(int[] nums) {
        for(int i=0;i<nums.length;i++){
            if(nums[i]<0) nums[i]=-nums[i];
        }
        Arrays.sort(nums);
        int n=nums.length;
        int k=n/2;
        long ans1=0;
        long ans2=0;
        for(int i=0;i<n;i++){
            if(i<k){
                ans1+=nums[i]*nums[i];
            }
            else ans2+=nums[i]*nums[i];
        }
        return ans2-ans1;

    }
}
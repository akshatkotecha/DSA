class Solution {
    public int minOperations(int[] nums, int x) {
        int n=nums.length;
        int sum=0;
        for(int num : nums) sum+=num;
        int target=sum-x;
        if(target==0) return n;
        int max=-1;
        int left=0;
        int sum1=0;
     //   sum1+=nums[0];
        for(int right=0;right<n;right++){
            sum1+=nums[right];
            while(sum1>target && left<right) {
                sum1-=nums[left++];
            }
            if(sum1==target){
                max=Math.max(max,right-left+1);
            }
        }
        if(max==-1) return -1;
        else return n-max;

    }
}
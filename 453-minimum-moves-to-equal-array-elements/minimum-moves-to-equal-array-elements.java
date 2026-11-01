class Solution {
    public int minMoves(int[] nums) {
        int min=nums[0];
        int n=nums.length;
        int sum=0;
        for(int num : nums){
            sum+=num;
            min=Math.min(min,num);
        }
        return sum-n*min;

    }
}
class Solution {
    public int minRange(int a, int b, int c) {
        int nums[]=new int[]{a,b,c};
        Arrays.sort(nums);
        int min=nums[2]-nums[0];
        if(nums[2]>=nums[0]+nums[1]) min=Math.min(min,nums[1]);
        return min;
    }
}
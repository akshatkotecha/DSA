class Solution {
    public int sortPermutation(int[] nums) {
        int c=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]!=i) c&=nums[i];
        }
        if(c==Integer.MAX_VALUE) return 0;
        return c;
    }
}
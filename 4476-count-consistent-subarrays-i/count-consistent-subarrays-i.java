class Solution {
    public int countConsistent(int[] nums) {
        int c=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            int num=Integer.MAX_VALUE;
            int min=Integer.MAX_VALUE;
            for(int j=i;j<n;j++){
                num&=nums[j];
                min=Math.min(min,nums[j]);
                if(num==min) c++;
            }
        }
        return c;
    }
}
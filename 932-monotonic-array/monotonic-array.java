class Solution {
    public boolean isMonotonic(int[] nums) {
        boolean ok1=true;
        boolean ok2=true;
        for(int i=1;i<nums.length;i++){
            if(nums[i]>nums[i-1]) ok1=false;
            if(nums[i]<nums[i-1]) ok2=false;
        }
        return (ok1 || ok2);
    }
}
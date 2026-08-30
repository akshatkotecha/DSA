class Solution {
    public int minimumDeletions(int[] nums) {
        int n=nums.length;
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        int i=0;
        int j=0;
        for(int k=0;k<n;k++){
            if(nums[k]>max) {
                max=nums[k];
                i=k;
            }
            if(nums[k]<min){
                min=nums[k];
                j=k;
            }
        }
        int ans1=Math.max(i,j)+1;
        int ans2=n-Math.min(i,j);
        int ans3=i+n-j+1;
        int ans4=j+n-i+1;
        return Math.min(ans1,Math.min(ans2,Math.min(ans3,ans4)));
    }
}
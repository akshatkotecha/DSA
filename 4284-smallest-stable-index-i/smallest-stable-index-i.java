class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int max[]=new int[nums.length];
        int min[]=new int[nums.length];
        max[0]=nums[0];
        int n=nums.length;
        for(int i=1;i<n;i++){
            max[i]=Math.max(max[i-1],nums[i]);
        }
        min[n-1]=nums[n-1];
        for(int i=n-2;i>=0;i--){
            min[i]=Math.min(min[i+1],nums[i]);
        }
        int ans=-1;
        for(int i=0;i<n;i++){
            if(max[i]-min[i]<=k){
                ans=i;
                break;
            }
        }
        return ans;
    }
}
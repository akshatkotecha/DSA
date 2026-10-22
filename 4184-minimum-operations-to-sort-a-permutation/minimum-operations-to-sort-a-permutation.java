class Solution {
    public int minOperations(int[] nums) {
        int n=nums.length;
        int p=0;
        for(int i=0;i<n;i++){
            if(nums[i]==0) {
                p=i;
                break;
            }
        }
        boolean ok1=true;
        boolean ok2=true;
        for(int i=0;i<n;i++){
            int next=nums[(i+1)%n];
            if(next!=(nums[i]+1)%n) ok1=false;
            if(next!=(nums[i]-1+n)%n) ok2=false;
        }
        int ans=Integer.MAX_VALUE;
        if(ok1) ans=Math.min(ans,Math.min(p,n-p+2));
        if(ok2) ans=Math.min(ans,Math.min(n-p,p+2));
        if(ans==Integer.MAX_VALUE) return -1;
        else return ans;
    }
}
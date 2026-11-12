class Solution {
    public int[] maxSubsequence(int[] nums, int k) {
        int n=nums.length;
        int a[][]=new int[n][2];
        for(int i=0;i<n;i++){
            a[i][0]=nums[i];
            a[i][1]=i;
        }
        Arrays.sort(a,(x,y)->y[0]-x[0]);
        int ans[][]=new int[k][2];
        for(int i=0;i<k;i++){
            ans[i][0]=a[i][0];
            ans[i][1]=a[i][1];
        }
        Arrays.sort(ans,(x,y)->x[1]-y[1]);
        int b[]=new int[k];
        for(int i=0;i<k;i++){
            b[i]=ans[i][0];
        }
        return b;
    }
}
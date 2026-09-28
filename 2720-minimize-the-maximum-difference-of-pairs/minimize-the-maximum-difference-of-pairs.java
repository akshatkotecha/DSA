class Solution {
    private int check(int a[],int threshold){
        int c=0;
        for(int i=0;i<a.length-1;i++){
            if(a[i+1]-a[i]<=threshold){
                c++;
                i++;
            }
        }
        return c;
    }
    public int minimizeMax(int[] nums, int p) {
        Arrays.sort(nums);
        int n=nums.length;
        int left=0;
        int right=nums[n-1]-nums[0];
        while(left<right){
            int mid=left+(right-left)/2;
            if(check(nums,mid)>=p){
                right=mid;
            }
            else left=mid+1;
        }
        return left;
    }
}
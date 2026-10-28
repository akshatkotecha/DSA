class Solution {
    public boolean canSplitArray(List<Integer> nums, int m) {
        int n=nums.size();
        if(n<=2) return true;
        for(int i=1;i<n;i++){
            if(nums.get(i)+nums.get(i-1)>=m) return true;
        }
        return false;
    }
}
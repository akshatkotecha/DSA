class Solution {
    private boolean check(int []nums,int start){
        HashSet<Integer> set=new HashSet<>();
        int n=nums.length;
        for(int i=start;i<n;i++){
            if(set.contains(nums[i])) return false;
            set.add(nums[i]);
        }
        return true;
    }
    public int minimumOperations(int[] nums) {
        int ans=0;
        for(int i=0;i<nums.length;i+=3){
            if(check(nums,i)) return ans;
            ans++;
        }
        return ans;
    }
}
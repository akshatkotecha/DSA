class Solution {
    public long findMaximumScore(List<Integer> nums) {
        long ans=0;
        int max=0;
        for(int num :nums){
            ans+=max;
            max=Math.max(max,num);
        }
        return ans;
    }
}
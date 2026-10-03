class Solution {
    public int countCompleteSubarrays(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        for(int num : nums) set.add(num);
        int k=set.size();
        int count=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            Set<Integer> set2=new HashSet<>();
            for(int j=i;j<n;j++){
                set2.add(nums[j]);
                if(set2.size()==k){
                    count+=n-j;
                    break;
                }
            }
        }
        return count;
    }
}
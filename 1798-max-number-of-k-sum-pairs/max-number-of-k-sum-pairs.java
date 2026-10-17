class Solution {
    public int maxOperations(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int count=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            int ans=k-nums[i];
            if(map.containsKey(ans)){
                count++;
                if(map.get(ans)==1) map.remove(ans);
                else map.put(ans,map.get(ans)-1);
            }
            else map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        return count;
    }
}
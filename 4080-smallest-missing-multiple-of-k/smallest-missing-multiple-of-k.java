class Solution {
    public int missingMultiple(int[] nums, int k) {
        HashSet<Integer> set=new HashSet<>();
        for(int num : nums) set.add(num);
        for(int i=1;i<105;i++){
            if(!set.contains(i*k)) return i*k;
        }
        return -1;
    }
}
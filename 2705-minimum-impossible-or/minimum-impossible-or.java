class Solution {
    public int minImpossibleOR(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        for(int num : nums) set.add(num);
        for(int i=0;i<31;i++){
            if(!set.contains(1<<i)) return 1<<i;
        }
        return -1;
    }
}
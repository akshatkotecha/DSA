class Solution {
    public Map<Integer, List<Integer>> getIndexMap(int[] nums) {
        Map<Integer, List<Integer>> map = new HashMap<>(); 
        for (int i = 0; i < nums.length; i++) {
            map.computeIfAbsent(nums[i], k -> new ArrayList<>()).add(i);
        }   
        return map;
    }
    public int countSpecialIntegers(int[] nums) {
        Map<Integer,List<Integer>> map=getIndexMap(nums);
        int c=0;
        for(int num : map.keySet()){
            List<Integer> list=map.get(num);
            if(list.size()!=3) continue;
            if(list.get(1)-list.get(0)==list.get(2)-list.get(1)) c++;
        }
        return c;
    }
}
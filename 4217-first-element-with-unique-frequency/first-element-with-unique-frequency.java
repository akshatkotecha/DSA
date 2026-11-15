class Solution {
    public int firstUniqueFreq(int[] nums) {
        HashMap<Integer,Integer> map1=new HashMap<>();
        HashMap<Integer,Integer> map2=new HashMap<>();
        for(int num : nums){
            map1.put(num,map1.getOrDefault(num,0)+1);
        }
        for(int num : map1.values()){
            map2.put(num,map2.getOrDefault(num,0)+1);
        }
        for(int num : nums){
            if(map2.get(map1.get(num))==1) return num;
        }
        return -1;
    }
}
class Solution {
    public List<List<Integer>> findMatrix(int[] nums) {
        int freq[]=new int[nums.length+1];
        ArrayList<List<Integer>> list=new ArrayList<>();
        for(int c : nums){
            if(freq[c]>=list.size()){
                list.add(new ArrayList<>());
            }
            list.get(freq[c]).add(c);
            freq[c]++;
        }
        return list;
    }
}
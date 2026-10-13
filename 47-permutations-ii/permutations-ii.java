class Solution {
    private void backtrack(HashSet<List<Integer>> set,List<Integer> list,int nums[],boolean used[]){
        if(list.size()==nums.length) {
            set.add(new ArrayList<>(list));
            return;
        }
        for(int j=0;j<nums.length;j++){
            if(used[j]) continue;
            used[j]=true;
            list.add(nums[j]);
            backtrack(set,list,nums,used);
            list.remove(list.size()-1);
            used[j]=false;
        }
    }
    public List<List<Integer>> permuteUnique(int[] nums) {
        HashSet<List<Integer>> set=new HashSet<>();
        backtrack(set,new ArrayList<>(),nums, new boolean[nums.length]);
        List<List<Integer>> list=new ArrayList<>(set);
        return list;

    }
}
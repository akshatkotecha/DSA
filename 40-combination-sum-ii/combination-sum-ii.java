class Solution {
    public void backtrack(int idx,int []nums,int target,List<Integer> list1,Set<List<Integer>> list){
        if(target==0 || idx==nums.length){
            if(target==0) list.add(new ArrayList<>(list1));
            return;
        }
        if(target<0) return;
        list1.add(nums[idx]);
        backtrack(idx+1,nums,target-nums[idx],list1,list);
        list1.remove(list1.size()-1);
        while(idx+1<nums.length && nums[idx]==nums[idx+1]) idx++;
        backtrack(idx+1,nums,target,list1,list);
    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Set<List<Integer>> list=new HashSet<>();
        Arrays.sort(candidates);
        backtrack(0,candidates,target,new ArrayList<>(),list);
        return new ArrayList<>(list);
        
    }
}
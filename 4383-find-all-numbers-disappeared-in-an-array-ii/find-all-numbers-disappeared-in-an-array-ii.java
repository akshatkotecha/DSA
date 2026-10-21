class Solution {
    public List<List<Integer>> findDisappearedNumbers(int[] nums, int lower, int upper) {
        List<List<Integer>> list=new ArrayList<>();
        HashSet<Integer> set=new HashSet<>();
        for(int num : nums) set.add(num);
        int prev=-1;
        for(int i=lower;i<=upper;i++){
            if(set.contains(i)){
                if(prev!=-1){
                List<Integer> list1=new ArrayList<>();
                list1.add(prev);
                list1.add(i-1);
                prev=-1;
                list.add(list1);
                }
            }
            else{
                if(prev==-1){
                    prev=i;
                }
            }
        }
        if(prev!=-1){
                List<Integer> list1=new ArrayList<>();
                list1.add(prev);
                if(set.contains(upper)) list1.add(prev);
                else list1.add(upper);
                list.add(list1);
            }
        return list;
    }
}
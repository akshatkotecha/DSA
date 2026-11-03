class Solution {
    public int minLengthAfterRemovals(List<Integer> nums) {
       int size=nums.size();
       int ans=nums.size();
       int i=0;
       int j=(size+1)/2;
       while(i<size/2 && j<size){
        if(nums.get(i)<nums.get(j)) ans-=2;
        i++;
        j++;
       } 
       return ans;
    }
}
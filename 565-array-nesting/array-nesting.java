class Solution {
    public int arrayNesting(int[] nums) {
        boolean visited[]=new boolean[nums.length];
        int max=0;
        for(int i=0;i<nums.length;i++){
            if(!visited[i]){
                int start=nums[i];
                int count=0;
                while(!visited[start]){
                    visited[start]=true;
                    start=nums[start];
                    count++;
                }
                max=Math.max(max,count);
            }
        }
        return max;
    }
}
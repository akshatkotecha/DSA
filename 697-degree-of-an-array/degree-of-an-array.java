class Solution {
    public int findShortestSubArray(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>(); 
        for(int num : nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        int max=1;
        for(int num : map.keySet()){
            if(map.get(num)>=max){
                max=map.get(num);
            }
        }
        int min=Integer.MAX_VALUE;
        for(int num : map.keySet()){
            if(map.get(num)==max){
                int left=0;
                int right=0;
                for(int i=0;i<nums.length;i++){
                    if(nums[i]==num){
                        left=i;
                        break;
                    }
                }
                for(int i=nums.length-1;i>=0;i--){
                    if(nums[i]==num){
                        right=i;
                        break;
                    }
                }
                min=Math.min(min,right-left+1);
            }
        }
        return min;
    }
}
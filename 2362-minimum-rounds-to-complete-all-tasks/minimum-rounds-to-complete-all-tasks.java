class Solution {
    public int minimumRounds(int[] tasks) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int num : tasks){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        int ans=0;
        for(int num : map.keySet()){
            if(map.get(num)==1) return -1;
            ans+=(map.get(num))/3;
            if(map.get(num)%3!=0) ans++;
        }
        return ans;
    }
}
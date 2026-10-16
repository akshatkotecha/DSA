class Solution {
    public int maximumPopulation(int[][] logs) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int log [] : logs){
            int start=log[0];
            int end=log[1]-1;
            for(int i=start;i<=end;i++){
                map.put(i,map.getOrDefault(i,0)+1);
            }
        }
        int max=0;
        int ans=1950;
        List<Integer> list=new ArrayList<>(map.keySet());
        Collections.sort(list);
        for(int num : list){
            int freq=map.get(num);
            if(freq>max){
                ans=num;
                max=freq;
            }
        }
        return ans;
    }
}
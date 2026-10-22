class Solution {
    public boolean isPossibleDivide(int[] hand, int groupSize) {
        int n=hand.length;
        if(n%groupSize!=0) return false;
        TreeMap<Integer,Integer> map=new TreeMap<>();
        for(int num : hand) map.put(num,map.getOrDefault(num,0)+1);
        while(!map.isEmpty())
        {
            int first=map.firstKey();
            for(int i=0;i<groupSize;i++)
            {
                int key=first+i;
                if(!map.containsKey(key)) return false;
                int c=map.get(key);
                if(c==1) map.remove(key);
                else map.put(key,c-1);
            }
        }
        return true;
    }
}
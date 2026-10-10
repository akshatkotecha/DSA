class Solution {
    public int findMaximizedCapital(int k, int w, int[] profits, int[] capital) {
       int n=profits.length;
       int a[][]=new int[n][2];
       for(int i=0;i<n;i++){
        a[i][0]=capital[i];
        a[i][1]=profits[i];
       } 
       Arrays.sort(a,(x,y)->x[0]-y[0]);
       PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
       int i=0;
       while(k-->0){
        while(i<n && a[i][0]<=w){
            pq.add(a[i][1]);
            i++;
        }
        if(pq.isEmpty()) break;
        w+=pq.poll();
       }
       return w;
    }
}
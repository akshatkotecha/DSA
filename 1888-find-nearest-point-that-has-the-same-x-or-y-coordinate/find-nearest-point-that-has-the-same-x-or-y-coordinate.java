class Solution {
    public int nearestValidPoint(int x, int y, int[][] points) {
        int ans=-1;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<points.length;i++){
            int a=points[i][0];
            int b=points[i][1];
            if(x==a || y==b){
                int dist=Math.abs(x-a)+Math.abs(y-b);
                if(dist<min){
                    min=dist;
                    ans=i;
                }
            }
        }
        if(min==Integer.MAX_VALUE) return -1;
        else return ans;
    }
}
class Solution {
    public int findMinArrowShots(int[][] points) {
        Arrays.sort(points,(x,y)->Integer.compare(x[1], y[1]));
        int n=points.length;
        int ans=1;
        int prev=points[0][1];
        for(int i=1;i<n;i++){
            if(prev<points[i][0]){
                ans++;
                prev=points[i][1];
            }
            else{
                prev=Math.min(prev,points[i][1]);
            }
        }
        return ans;
        
    }
}
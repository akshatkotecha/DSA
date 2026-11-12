class Solution {
    public int eliminateMaximum(int[] dist, int[] speed) {
        double a[]=new double[dist.length];
        int n=dist.length;
        for(int i=0;i<n;i++){
            a[i]=(double)dist[i]/speed[i];
        }
        Arrays.sort(a);
        int ans=0;
        for(int i=0;i<n;i++){
            if(a[i]<=i) break;
            ans++;
        }
        return ans;
    }
}
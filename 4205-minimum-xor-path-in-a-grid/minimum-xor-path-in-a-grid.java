class Solution {
    public int minCost(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        boolean dp[][][]=new boolean[m][n][1024];
        dp[0][0][grid[0][0]]=true;
        for(int j=1;j<n;j++){
            for(int x=0;x<1024;x++){
                if(dp[0][j-1][x]){
                    dp[0][j][x^grid[0][j]]=true;
                }
            }
        }
        for(int i=1;i<m;i++){
            for(int x=0;x<1024;x++){
                if(dp[i-1][0][x]) {
                    dp[i][0][x^grid[i][0]]=true;
                }
            }
        }
        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){
                for(int x=0;x<1024;x++){
                    if(dp[i-1][j][x] || dp[i][j-1][x]){
                        dp[i][j][x^grid[i][j]]=true;
                    }
                }
            }
        }
        for(int x=0;x<1024;x++){
            if(dp[m-1][n-1][x]) return x;
        }
        return -1;

    }
}
class Solution {
    public int dfs(int [][] grid,int i,int j,int prev){
        if(i<0 || i>=grid.length || j<0 || j>=grid[0].length || prev>=grid[i][j]) return 0;
        prev=grid[i][j];
        grid[i][j]=Integer.MAX_VALUE;
        return 1+Math.max(dfs(grid,i-1,j+1,prev),Math.max(dfs(grid,i+1,j+1,prev),dfs(grid,i,j+1,prev)));
    }
    public int maxMoves(int[][] grid) {
        int ans=0;
        for(int i=0;i<grid.length;i++){
            ans=Math.max(ans,dfs(grid,i,0,0));
        }
        return ans-1;

    }
}
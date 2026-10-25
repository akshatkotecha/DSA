class Solution {
    public boolean dfs(int grid[][],int i,int j){
        if(i<0 || j<0 || i>=grid.length || j>=grid[0].length) return false;
        if(grid[i][j]==1) return true;
        grid[i][j]=1;
        return dfs(grid,i-1,j)&dfs(grid,i+1,j)&dfs(grid,i,j+1)&dfs(grid,i,j-1);
    }
    public int closedIsland(int[][] grid) {
        int ans=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==0){
                    if(dfs(grid,i,j)) ans++;
                }
            }
        }
        return ans;
    }
}
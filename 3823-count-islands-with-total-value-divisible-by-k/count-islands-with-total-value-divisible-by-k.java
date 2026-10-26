class Solution {
    private long dfs(int grid[][],int i,int j){
        if(i<0 || j<0 || i>=grid.length || j>=grid[0].length || grid[i][j]==0){
            return 0;
        }
        long num=(long)grid[i][j];
        grid[i][j]=0;
        return num+dfs(grid,i-1,j)+dfs(grid,i+1,j)+dfs(grid,i,j-1)+dfs(grid,i,j+1);
    }
    public int countIslands(int[][] grid, int k) {
        int ans=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]!=0) {
                    long num =dfs(grid,i,j);
                    if(num%k==0) ans+=1;
                }
            }
        }
        return ans;
    }
}
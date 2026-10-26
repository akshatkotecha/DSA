class Solution {
    private int[] dfs(char [][]grid,int i,int j){
        if(i<0 || j<0 || i>=grid.length || j>=grid[0].length || grid[i][j]=='X') return new int[]{i,j};
        char ch=grid[i][j];
        grid[i][j]='X';
        int x=i;
        int y=j;
        if(ch=='R') y++;
        else if(ch=='L') y--;
        else if(ch=='U') x--;
        else x++;
        if(x<0 || y<0 || x>=grid.length || y>=grid[0].length || grid[x][y]=='X') return new int[]{i,j};
        return dfs(grid,x,y);

    }
    public int[] lastVisitedCell(char[][] grid) {
        //if(grid[0][0]=='U' || grid[0][0]=='L') return new int[]{0,0};
        return dfs(grid,0,0);
    }
}
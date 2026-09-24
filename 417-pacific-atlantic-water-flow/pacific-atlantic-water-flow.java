class Solution {
    int m,n;
    private int directions[][]={{-1,0},{1,0},{0,1},{0,-1}};
    private void dfs(int [][] heights,int i,int j,boolean visited[][]){
        m=heights.length;
        n=heights[0].length;
        if(visited[i][j])  return;
        visited[i][j]=true;
        for(int dir[] : directions){
            int x=i+dir[0];
            int y=j+dir[1];
            if(x<0 || y<0 || x>=m || y>=n) continue;
            if(heights[x][y]<heights[i][j])  continue;
            dfs(heights,x,y,visited);
        }
    }
    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        m=heights.length;
        n=heights[0].length;
        boolean ok1[][]=new boolean[m][n];
        boolean ok2[][]=new boolean[m][n];
        for(int i=0;i<m;i++) dfs(heights,i,0,ok1);
        for(int j=0;j<n;j++) dfs(heights,0,j,ok1);
        for(int i=0;i<m;i++) dfs(heights,i,n-1,ok2);
        for(int j=0;j<n;j++) dfs(heights,m-1,j,ok2);
        List<List<Integer>> list=new ArrayList<>();
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(ok1[i][j] && ok2[i][j]){
                    list.add(Arrays.asList(i,j));
                }
            }
        }
        return list;


    }
}
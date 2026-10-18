class Solution {
    private long mod=1000000007;
    private long a[][];
    public int numOfWays(int[] nums) {
        int m=nums.length;
        a=new long[m][m];
        for(int i=0;i<m;i++){
            a[i][0]=a[i][i]=1;
        }
        for(int i=2;i<m;i++){
            for(int j=1;j<i;j++){
                a[i][j]=(a[i-1][j-1]+a[i-1][j])%mod;
            }
        }
        List<Integer> arrList = Arrays.stream(nums).boxed().collect(Collectors.toList());
        return (int) ((dfs(arrList) - 1) % mod);
    }
    private long dfs(List<Integer> list){
        int m=list.size();
        if(m<3) return 1;
        List<Integer> left=new ArrayList<>();
        List<Integer> right=new ArrayList<>();
        for(int i=1;i<m;i++){
            if(list.get(i)<list.get(0)) left.add(list.get(i));
            else right.add(list.get(i));
        }
        long leftways=dfs(left)%mod;
        long rightways=dfs(right)%mod;
        return (((leftways*rightways)%mod)*(a[m-1][left.size()]))%mod;
    }
}
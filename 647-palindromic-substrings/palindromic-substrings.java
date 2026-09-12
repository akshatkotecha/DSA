class Solution {
    public int countSubstrings(String s) {
        int ans=0;
        int n=s.length();
        boolean dp[][]=new boolean[n][n];
        for(int i=n-1;i>=0;i--){
            for(int j=i;j<n;j++){
                if(i==j) dp[i][j]=true;
                else if(j==i+1) dp[i][j]=(s.charAt(i)==s.charAt(j));
                else{
                    dp[i][j]=(s.charAt(i)==s.charAt(j)) && dp[i+1][j-1];
                }

                if(dp[i][j]) ans++;
            }
        }
        return ans;
    }
}
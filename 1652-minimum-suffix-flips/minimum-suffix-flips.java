class Solution {
    public int minFlips(String target) {
        int ans=0;
        int n=target.length();
        boolean ok=false;
        for(char ch : target.toCharArray()){
            if((ch=='1' && !ok) || (ch=='0' && ok)){
                ans++;
                ok^=true;
            }
        }
        return ans;
    }
}
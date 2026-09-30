class Solution {
    public int[] maxDepthAfterSplit(String seq) {
        int d=0;
        int n=seq.length();
        int ans[]=new int[n];
        int i=0;
        for(char ch : seq.toCharArray()){
            if(ch=='('){
                d++;
                ans[i++]=d%2;
            }
            else{
                ans[i++]=d%2;
                d--;
            }
        }
        return ans;
    }
}
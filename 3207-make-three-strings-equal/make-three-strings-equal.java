class Solution {
    public int findMinimumOperations(String s1, String s2, String s3) {
        int ans=0;
        int i=0;
        while(i<s1.length() && i<s2.length() && i<s3.length()){
            if(s1.charAt(i)==s2.charAt(i) && s2.charAt(i)==s3.charAt(i)) i++;
            else{
                break;
            }
        }
        ans=s1.length()+s2.length()+s3.length()-3*i;
        if(i==0) return -1;
        else return ans;
    }
}
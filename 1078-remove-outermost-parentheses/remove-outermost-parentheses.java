class Solution {
    public String removeOuterParentheses(String s) {
        int n=s.length();
        StringBuilder sb=new StringBuilder();
        int start=0;
        int bal=0;
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='(') bal++;
            else bal--;
            if(bal==0){
                sb.append(s.substring(start+1,i));
                start=i+1;
            }
        }
        return sb.toString();
    }
}
class Solution {
    public int scoreOfParentheses(String s) {
        int ans=0;
        int bal=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='(') bal++;
            else{
                bal--;
                if(s.charAt(i-1)=='(') ans+=(1<<bal);            
            }
        }
        return ans;
    }
}
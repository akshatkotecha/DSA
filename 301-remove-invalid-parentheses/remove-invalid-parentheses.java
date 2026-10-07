class Solution {
    public void backtrack(String s,int idx,int bal,int l,int r,StringBuilder sb,HashSet<String> set){
        if(bal<0 || l<0 || r<0)  return;
        if(idx==s.length()){
            if(bal==0 && r==0 && l==0){
                set.add(sb.toString());
            }
            return;
        }
        char c=s.charAt(idx);
        int len=sb.length();
        if(c=='('){
            backtrack(s,idx+1,bal,l-1,r,sb,set);
            sb.append(c);
            backtrack(s,idx+1,bal+1,l,r,sb,set);
            sb.setLength(len);
        }
        else if(c==')'){
            backtrack(s,idx+1,bal,l,r-1,sb,set);
            sb.append(c);
            backtrack(s,idx+1,bal-1,l,r,sb,set);
            sb.setLength(len);
        }
        else{
            sb.append(c);
            backtrack(s,idx+1,bal,l,r,sb,set);
            sb.setLength(len);
        }
    }
    public List<String> removeInvalidParentheses(String s) {
        int left=0;
        int right=0;
        for(char ch : s.toCharArray()){
            if(ch=='(') left++;
            else if(ch==')'){
                if(left>0) left--;
                else right++;
            }
        }
        HashSet<String> set=new HashSet<>();
        StringBuilder sb=new StringBuilder();
        backtrack(s,0,0,left,right,sb,set);
        return new ArrayList<>(set);
        
    }
    
}
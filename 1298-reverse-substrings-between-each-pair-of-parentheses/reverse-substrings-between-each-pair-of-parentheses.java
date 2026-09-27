class Solution {
    private void reverse(char c [],int l,int r){
        while(l<r){
            char temp=c[l];
            c[l]=c[r];
            c[r]=temp;
            l++;
            r--;
        }
    }
    public String reverseParentheses(String s) {
        char c[]=s.toCharArray();
        int n=s.length();
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<n;i++){
            if(c[i]=='(') st.push(i);
            else if(c[i]==')'){
                int l=st.pop()+1;
                int r=i-1;
                reverse(c,l,r);
            }
        }
        StringBuilder sb=new StringBuilder();
        for(char ch : c){
            if(ch!='(' && ch!=')') sb.append(ch);
        }
        return sb.toString();
    }
}
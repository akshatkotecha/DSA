class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> st=new Stack<>();
        for(char ch : s.toCharArray()){
            if(ch!='#') st.push(ch);
            else{
                if(st.isEmpty()) continue;
                st.pop();
            }
        }
        StringBuilder sb1=new StringBuilder();
        StringBuilder sb2=new StringBuilder();
        while(!st.isEmpty()) sb1.append(st.pop());
        for(char ch : t.toCharArray()){
            if(ch!='#') st.push(ch);
            else{
                if(st.isEmpty()) continue;
                st.pop();
            }
        }
        while(!st.isEmpty()) sb2.append(st.pop());
        return sb1.toString().equals(sb2.toString());
    }
}
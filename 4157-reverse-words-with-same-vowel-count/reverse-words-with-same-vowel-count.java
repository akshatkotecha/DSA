class Solution {
    public int  count(String s){
        int c=0;
        for(char ch : s.toCharArray()){
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') c++;
        }
        return c;
    }
    public String reverseWords(String s) {
        String words[]=s.split(" ");
        int cur=count(words[0]);
        for(int i=1;i<words.length;i++){
            int c=count(words[i]);
            if(cur==c){
                StringBuilder sb=new StringBuilder(words[i]);
                words[i]=sb.reverse().toString();
            }
        }
        return String.join(" ",words);
        
    }
}
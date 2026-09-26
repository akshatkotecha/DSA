class Solution {
    public String evaluate(String s, List<List<String>> knowledge) {
        HashMap<String,String> map=new HashMap<>();
        StringBuilder sb=new StringBuilder();
        for(List<String> str: knowledge){
            map.put(str.get(0),str.get(1));
        }
        int start=-1;
        int end=-1;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='(') {
                start=i;
            }
            else if(ch==')'){
                end=i;
                String str=s.substring(start+1,end);
                if(map.containsKey(str)) sb.append(map.get(str));
                else sb.append('?');
                start=-1;
                end=-1;
            }
            else if(start==-1 && end==-1){
                sb.append(ch);
            }
        }
        return sb.toString();

    }
}
class Solution {
    public List<Integer> partitionLabels(String s) {
        int a[]=new int[26];
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            a[ch-'a']=i;
        }
        int start=0;
        int end=0;
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<s.length();i++){
            end=Math.max(end,a[s.charAt(i)-'a']);
            if(end==i){
                list.add(i-start+1);
                start=i+1;
            }
        }
        return list;
    }
}
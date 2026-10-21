class Solution {
    public int minOperations(String s) {
        char ch1[]=s.toCharArray();
        char ch2[]=s.toCharArray();
        Arrays.sort(ch2);
        char max='a';
        char min='z';
        for(char ch : s.toCharArray()){
            max=(char)Math.max(max,ch);
            min=(char)Math.min(min,ch);
        }
        Arrays.sort(ch2);
        if(Arrays.equals(ch1,ch2)) return 0;
        if(s.length()==2) return -1;
        if(min==s.charAt(0) || max==s.charAt(s.length()-1)) return 1;
        for(int i=1;i<s.length()-1;i++){
            if(s.charAt(i)==min || s.charAt(i)==max) return 2;
        }
        return 3;
    }
}
class Solution {
    public int minFlipsMonoIncr(String s) {
        int o=0;
        int flips=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='1') o++;
            else {
                flips=Math.min(flips+1,o);
            }
        }
        return flips;
    }
}
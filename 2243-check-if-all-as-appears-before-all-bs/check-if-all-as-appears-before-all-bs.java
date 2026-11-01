class Solution {
    public boolean checkString(String s) {
        boolean ok=false;
        for(char ch : s.toCharArray()){
            if(ch=='b') ok=true;
            if(ok && ch=='a') return false;
        }
        return true;
    }
}
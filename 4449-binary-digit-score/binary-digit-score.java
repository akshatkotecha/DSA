class Solution {
    public int calculateScore(int a, int b) {
        int x=Integer.bitCount(a);
        int y=Integer.bitCount(b);
        if(x>=y) return x*y;
        else return y/x;

    }
}
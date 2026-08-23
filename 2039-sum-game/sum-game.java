class Solution {
    public boolean sumGame(String num) {
       int n=num.length();
       int mid=n/2;
       int sum1=0;
       int c1=0;
       int sum2=0;
       int c2=0;
       for(int i=0;i<mid;i++){
        if(num.charAt(i)=='?') c1++;
        else sum1+=num.charAt(i)-'0';
       }
       for(int i=mid;i<n;i++){
        if(num.charAt(i)=='?') c2++;
        else sum2+=num.charAt(i)-'0';
       }
       if((c1+c2)%2==1) return true;
       return 2*(sum1-sum2)!=9*(c2-c1);
    }
}
class Solution {
    public long removeZeros(long n) {
        long ans=0;
        while(n>0){
            while(n%10==0) n/=10;
            ans=ans*10+(n%10);
            n/=10;
        }
        long num=0;
        while(ans>0){
            num=num*10+(ans%10);
            ans/=10;
        }
        return num;
    }
}
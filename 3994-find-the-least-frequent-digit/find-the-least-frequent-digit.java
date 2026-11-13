class Solution {
    public int getLeastFrequentDigit(int n) {
        int a[]=new int[10];
        while(n>0){
            a[n%10]++;
            n/=10;
        }
        int min=Integer.MAX_VALUE;
        int ans=0;
        for(int i=0;i<10;i++){
            if(a[i]>0 && a[i]<min){
                min=a[i];
                ans=i;
            }
        }
        return ans;
    }
}
class Solution {
    public int minSwaps(String s) {
        int n=s.length();
        int c=0;
        if(n==1) return 0;
        for(char ch : s.toCharArray()){
            if(ch=='1') c++;
        }
        int c1=n-c;
        if(Math.abs(c1-c)>1) return -1;
        StringBuilder sb1=new StringBuilder();
        StringBuilder sb2=new StringBuilder();
        for(int i=0;i<n;i++){
            if(i%2==1){
                sb1.append('1');
                sb2.append('0');
            }
            else{
                sb1.append('0');
                sb2.append('1');
            }
        }
        String str1=sb1.toString();
        String str2=sb2.toString();
        int min1=0;
        int min2=0;
        for(int i=0;i<n;i++){
            if(str1.charAt(i)!=s.charAt(i)) min1++;
            if(str2.charAt(i)!=s.charAt(i)) min2++;
        }
        if(c>c1) return min2/2;
        if(c1>c)  return min1/2;
        return Math.min(min1/2,min2/2);
    }
}
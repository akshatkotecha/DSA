class Solution {
    public String generateTheString(int n) {
        StringBuilder sb=new StringBuilder();
        if(n%2==1){
            for(int i=0;i<n;i++){
                sb.append('a');
            }
        }
        else{
            if(n%4==0){
                sb.append('a');
                for(int i=0;i<n-1;i++){
                    sb.append('b');
                }
            }
            else{
                for(int i=0;i<n/2;i++){
                    sb.append('a');
                    sb.append('b');
                }
            }
        }
        return sb.toString();
    }
}
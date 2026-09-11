class Solution {
    public int totalNumbers(int[] digits) {
        HashSet<Integer> set=new HashSet<>();
        int n=digits.length;
        if(n<3) return 0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                for(int k=0;k<n;k++){
                    if(digits[i]==0) continue;
                    if(i==j || j==k  || i==k) continue;
                    int num=digits[i]*100 + digits[j]*10 + digits[k];
                    if(num%2==0) set.add(num);
                }
            }
        }
        return set.size();
    }
}
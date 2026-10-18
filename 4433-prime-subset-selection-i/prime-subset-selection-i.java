class Solution {
    public static boolean isPrime(int n) {
        if (n < 2) return false;
        if (n < 4) return true;
        if (n % 2 == 0 || n % 3 == 0) return false;

        for (int i = 5; i * i <= n; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0)
                return false;
        }

        return true;
    }
    public List<Integer> maxPrimes(int n, int s) {
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<=n;i++){
            if(isPrime(i) && s>=i){
                list.add(i);
                s-=i;
            }
            if(i>s) break;
        }
        return list;
    }
}
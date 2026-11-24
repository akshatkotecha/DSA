class Solution {
    private int gcd(int a,int b){
        if(b==0) return a;
        else return gcd(b,a%b);
    }
    private int lcm(int a,int b){
        return a*b/gcd(a,b);
    }
    public int maxLength(int[] nums) {
        int ans=-1;
        int n=nums.length;
        for(int i=0;i<n;i++){
            int gcd=nums[i];
            int lcm=nums[i];
            int prod=1;
            for(int j=i;j<n;j++){
                gcd=gcd(gcd,nums[j]);
                lcm=lcm(lcm,nums[j]);
                prod*=nums[j];
                if(gcd*lcm==prod) ans=Math.max(ans,j-i+1);
            }
        }
        return ans;
    }
}
class Solution {
    public int gcd(int a,int b){
        if(b==0) return a;
        else return gcd(b,a%b);
    }
    public int minOperations(int[] nums, int[] numsDivide) {
        Arrays.sort(nums);
        int g=numsDivide[0];
        for(int num : numsDivide){
            g=gcd(g,num);
        }
        for(int i=0;i<nums.length;i++){
            if(g%nums[i]==0) return i;
        }
        return -1;
    }
}
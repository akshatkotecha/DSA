class Solution {
    private int sum(int num){
        int ans=0;
        while(num>0){
            ans+=num%10;
            num/=10;
        }
        return ans;
    }
    public int minSwaps(int[] nums) {
        int n=nums.length;
        int a[][]=new int[n][3];
        for(int i=0;i<n;i++){
            a[i][0]=nums[i];
            a[i][1]=sum(nums[i]);
            a[i][2]=i;
        }
        Arrays.sort(a,(x,y)->{
            if(x[1]!=y[1]) return x[1]-y[1];
            else return x[0]-y[0];
        });
        boolean used[]=new boolean[n];
        int swaps=0;
        for(int i=0;i<n;i++){
            if(used[i] || a[i][2]==i){
                continue;
            }
            int size=0;
            int j=i;
            while(!used[j]){
                used[j]=true;
                j=a[j][2];
                size++;
            }
            if(size>1) swaps+=(size-1);
        }
        return swaps;
    }
}
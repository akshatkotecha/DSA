class Solution {
    public int findLucky(int[] arr) {
        int a[]=new int[501];
        for(int num : arr) a[num]++;
        int max=-1;
        for(int i=1;i<=500;i++){
            if(i==a[i]) max=i;
        }
        return max;
    }
}
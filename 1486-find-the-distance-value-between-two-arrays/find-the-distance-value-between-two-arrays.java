class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int ans=0;
        for(int i=0;i<arr1.length;i++){
            boolean ok=true;
            int num1=arr1[i];
            for(int j=0;j<arr2.length;j++){
                int num2=arr2[j];
                if(Math.abs(num1-num2)<=d) ok=false;
            }
            if(ok) ans+=1;
        }
        return ans;
    }
}
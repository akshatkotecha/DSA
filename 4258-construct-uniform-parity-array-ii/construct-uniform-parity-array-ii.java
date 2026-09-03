class Solution {
    public boolean uniformArray(int[] nums1) {
        boolean ok1=true;
        boolean ok2=true;
        int smallodd=Integer.MAX_VALUE;
        int smalleven=Integer.MAX_VALUE;
        for(int i=0;i<nums1.length;i++){
            if(nums1[i]%2==1) smallodd=Math.min(smallodd,nums1[i]);
            else smalleven=Math.min(smalleven,nums1[i]);;
        }
        if(smallodd==Integer.MAX_VALUE || smalleven==Integer.MAX_VALUE) return true;
        int n=nums1.length;
        // check for even 
        
        //check for odd
        for(int i=0;i<n;i++){
            if(nums1[i]%2==0){
                if(nums1[i]-smallodd<0) return false;
            }
        }
        return true;
        
    }
}
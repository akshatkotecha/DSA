class Solution {
    public int[] lexicographicallySmallestArray(int[] nums, int limit) {
        int n=nums.length;
        int []a=nums.clone();
        Arrays.sort(a);
        HashMap<Integer,Integer> group=new HashMap<>();
        HashMap<Integer,Integer> pos=new HashMap<>();
        int ans[]=new int[n];
        int grp=0;
        group.put(a[0],grp);
        pos.put(grp,0);
        for(int i=1;i<n;i++){
            if(a[i]-a[i-1]>limit){
                grp++;
                pos.put(grp,i);
            }
            group.put(a[i],grp);
        }
        int i=0;
        while(i<n){
            int cur=group.get(nums[i]);
            int j=pos.get(cur);
            ans[i]=a[j];
            pos.put(cur,j+1);
            i++;
        }
        return ans;
    }
}
class Solution {
    public int maximumSetSize(int[] nums1, int[] nums2) {
        int n=nums1.length;
        HashSet<Integer> set1=new HashSet<>();
        HashSet<Integer> set2=new HashSet<>();
        for(int num : nums1) set1.add(num);
        for(int num : nums2) set2.add(num);
        int common=0;
        for(int num : set1){
            if(set2.contains(num)) common++;
        }
        int u1=set1.size()-common;
        int u2=set2.size()-common;
        if(u1>=n/2 && u2>=n/2) return n;
        if(u1<n/2 && u2<n/2) return Math.min(n,u1+u2+common);
        if(u1<n/2) return Math.min(n/2,u1+common)+n/2;
        return Math.min(n/2,u2+common)+n/2;
    }
}
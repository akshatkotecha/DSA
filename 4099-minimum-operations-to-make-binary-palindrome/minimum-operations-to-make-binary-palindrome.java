class Solution {
    private static boolean isPalindrome(String s){
        int n=s.length();
        int left=0;
        int right=n-1;
        while(left<right){
            if(s.charAt(left)!=s.charAt(right)) return false;
            left++;
            right--;
        }
        return true;
    }
    public int[] minOperations(int[] nums) {
        List<Integer> list=new ArrayList<>();
        for(int i=1;i<=5000;i++){
            String str=Integer.toBinaryString(i);
            if(isPalindrome(str)) list.add(i);
        }
        int a[]=new int[nums.length];
        int idx=0;
        for(int num : nums){
            int min=Integer.MAX_VALUE;
            for(int l : list){
                min=Math.min(min,Math.abs(l-num));
            }
            a[idx++]=min;
        }
        return a;
    }
}
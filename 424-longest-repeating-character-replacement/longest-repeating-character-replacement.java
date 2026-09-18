class Solution {
    public int characterReplacement(String s, int k) {
        int n=s.length();
        int []freq=new int[26];
        int max=0;
        int maxFreq=0;
        int left=0;
        int right=0;
        while(right<n){
            char ch=s.charAt(right);
            freq[ch-'A']++;
            maxFreq=Math.max(maxFreq,freq[ch-'A']);
            if((right-left+1)-maxFreq>k){
                freq[s.charAt(left)-'A']--;
                left++;
            }
            max=Math.max(max,right-left+1);
            right++;
        }
        return max;
    }
}
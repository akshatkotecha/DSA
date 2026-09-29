class Solution {
    public int leastInterval(char[] tasks, int n) {
        int freq[]=new int[26];
        int max=0;
        for(char ch : tasks){
            freq[ch-'A']++;
            max=Math.max(max,freq[ch-'A']);
        }
        int time=(max-1)*(n+1);
        for(int f : freq){
            if(f==max) time++;
        }
        return Math.max(time,tasks.length);
    }
}
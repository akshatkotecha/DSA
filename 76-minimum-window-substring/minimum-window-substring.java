class Solution {
    public String minWindow(String s, String t) {
        if(s.length()<t.length()) return "";
        int freqt[]=new int[128];
        int freqs[]=new int[128];
        int m=0;
        for(char ch : t.toCharArray()){
            if(freqt[ch]==0) m++;
            freqt[ch]++;
        } 
        char [] c=s.toCharArray();
        int n=s.length();
        int start=-1;
        int end=-1;
        int left=0;
        int min=Integer.MAX_VALUE;
        for(int right=0;right<n;right++){
            char ch=c[right];
            freqs[ch]++;
            if(freqs[ch]==freqt[ch]) m--;
            while(m==0 && left<=right){
                if(right-left+1<min){
                    min=right-left+1;
                    start=left;
                    end=right+1;
                }
                char chl=c[left++];
                freqs[chl]--;
                if(freqs[chl]<freqt[chl]) m++;
            }
        }
        if(min==Integer.MAX_VALUE) return "";
        else return s.substring(start,end);

    }
}
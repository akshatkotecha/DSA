class Solution {
    static int a[]=new int[]{0,31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    private static int day(int m,int n){
        int ans=0;
        for(int i=0;i<m;i++){
            ans+=a[i];
        }
        return ans+n;
    }
    public int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {
        int m1=Integer.parseInt(arriveAlice.substring(0,2));
        int n1=Integer.parseInt(arriveAlice.substring(3,5));
        int m2=Integer.parseInt(leaveAlice.substring(0,2));
        int n2=Integer.parseInt(leaveAlice.substring(3,5));
        int m3=Integer.parseInt(arriveBob.substring(0,2));
        int n3=Integer.parseInt(arriveBob.substring(3,5));
        int m4=Integer.parseInt(leaveBob.substring(0,2));
        int n4=Integer.parseInt(leaveBob.substring(3,5));
        int astart=day(m1,n1);
        int aend=day(m2,n2);
        int bstart=day(m3,n3);
        int bend=day(m4,n4);
        int start=Math.max(astart,bstart);
        int end=Math.min(aend,bend);
        return Math.max(0,end-start+1);
  
    }
}
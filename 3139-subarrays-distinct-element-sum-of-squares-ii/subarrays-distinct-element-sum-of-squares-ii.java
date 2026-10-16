class Solution {
    long []sum,sq,lazy;
    static long mod=1000000007;
    void apply(int node,int len,int v){
        sq[node]+=2*v*sum[node]+v*v*len;
        sum[node]+=v*len;
        lazy[node]+=v;
    }
    void push(int node,int l,int r){
        if(lazy[node]!=0){
            int mid=l+(r-l)/2;
            apply(node*2,mid-l+1,(int)lazy[node]);
            apply(node*2+1,r-mid,(int)lazy[node]);
            lazy[node]=0;
        }
    }
    void update(int node,int l,int r, int ql,int qr){
        if(qr<l || r<ql) return ;
        if(ql<=l && r<=qr){
            apply(node,r-l+1,1);
            return;
        }
        push(node,l,r);
        int mid=(l+r)/2;
        update(node*2,l,mid,ql,qr);
        update(node*2+1,mid+1,r,ql,qr);
        sum[node]=sum[node*2]+sum[node*2+1];
        sq[node]=sq[node*2]+sq[node*2+1];
    }
    public int sumCounts(int[] nums) {
        int n=nums.length;
        sum=new long[4*n+5];
        sq=new long[4*n+5];
        lazy=new long[4*n+5];
        int [] last=new int[100001];
        Arrays.fill(last,-1);
        long ans=0;
        for(int i=0;i<n;i++){
            update(1,0,n-1,last[nums[i]]+1,i);
            last[nums[i]]=i;
            ans=(ans+sq[1])%mod;
        }
        return (int)ans;
    }
}
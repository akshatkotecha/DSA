class Solution {
    public int minimumOperations(int[] nums) {
        HashMap<Integer,Integer> odd=new HashMap<>();
        HashMap<Integer,Integer> even=new HashMap<>();
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(i%2==1){
                odd.put(nums[i],odd.getOrDefault(nums[i],0)+1);
            }
            else even.put(nums[i],even.getOrDefault(nums[i],0)+1);
        }
        int modd=1;
        int meven=1;
        for(int num : odd.keySet()){
            if(odd.get(num)>modd){
                modd=odd.get(num);
            }
        }
        for(int num : even.keySet()){
            if(even.get(num)>meven){
                meven=even.get(num);
            }
        }
        int c1=0;
        int c2=0;
        int ans1=1;
        int ans2=1;
        for(int num : odd.keySet()){
            if(odd.get(num)==modd) {
                c1++;
                ans1=num;
            }
        }
        for(int num : even.keySet()){
            if(even.get(num)==meven){
                c2++;
                ans2=num;
            } 
        }
        
        even.remove(ans2);
        odd.remove(ans1);
        int freq1=0;
        int freq2=0;
        for(int num : odd.keySet()){
            if(odd.get(num)>freq1){
                freq1=odd.get(num);
            }
        }
        for(int num : even.keySet()){
            if(even.get(num)>freq2){
                freq2=even.get(num);
            }
        }
        int evenm=n/2;
        int oddm=n/2;
        if(n%2==1){
            evenm=n/2+1;
            oddm=n/2;
        }
        if(ans1!=ans2){
            return  (evenm-meven)+(oddm-modd);
        }
        int a=(evenm-freq2)+(oddm-modd);
        int b=(evenm-meven)+(oddm-freq1);
        return Math.min(a,b);
    }
}
class Solution {
    public long minSumSquareDiff(int[] nums1, int[] nums2, int k1, int k2) {
        int n = nums1.length;
        long k = (long) k1 + k2;
        Map<Integer, Long> freq = new HashMap<>();
        int maxDiff = 0;
        for (int i = 0; i < n; i++) {
            int d = Math.abs(nums1[i] - nums2[i]);
            freq.put(d, freq.getOrDefault(d, 0L) + 1);
            maxDiff = Math.max(maxDiff, d);
        }
        for (int d = maxDiff; d > 0 && k > 0; d--) {
            if (!freq.containsKey(d)) continue;

            long cnt = freq.get(d);
            long canReduce = Math.min(k, cnt);
            freq.put(d, cnt - canReduce);
            freq.put(d - 1, freq.getOrDefault(d - 1, 0L) + canReduce);
            k -= canReduce;
        }
        long ans = 0;
        for (Map.Entry<Integer, Long> e : freq.entrySet()) {
            long d = e.getKey();
            long c = e.getValue();
            ans += c * d * d;
        }
        return ans;
    }
}
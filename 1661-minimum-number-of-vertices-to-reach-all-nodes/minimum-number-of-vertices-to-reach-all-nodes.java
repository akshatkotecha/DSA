class Solution {
    public List<Integer> findSmallestSetOfVertices(int n, List<List<Integer>> edges) {
        List<Integer> list =new ArrayList<>();
        int indegree[]=new int[n];
        for(List<Integer>  list1 :edges){
            indegree[list1.get(1)]++;
        }
        for(int i=0;i<n;i++){
            if(indegree[i]==0) list.add(i);
        }
        return list;
    }
}
class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        int n=numCourses;
        int indegree[]=new int[n];
        List<List<Integer>> list=new ArrayList<>();
        for(int i=0;i<n;i++){
            list.add(new ArrayList<>());
        }
        for(int pre[] : prerequisites){
            list.get(pre[1]).add(pre[0]);
            indegree[pre[0]]++;
        }
        Queue<Integer> q=new LinkedList<>();
        for(int i=0;i<n;i++){
            if(indegree[i]==0) q.add(i);
        }
        int count=0;
        while(!q.isEmpty()){
            int x=q.poll();
            List<Integer> list1=new ArrayList<>(list.get(x));
            count++;
            for(int i=0;i<list1.size();i++){
                int y=list1.get(i);
                indegree[y]--;
                if(indegree[y]==0) q.add(list1.get(i));
            }
        }
        return count==n;
    }
}